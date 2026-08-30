package task3.proxy;

// Прокси контролирует доступ к настоящему интернету
public class ProxyInternet implements Internet{
    // Настоящий объект, к которому обращается Proxy
    private RealInternet realInternet = new RealInternet();

    @Override
    public void connectTo(String site) {

        // Проверяем, заблокирован ли сайт
        if (site.equals("blocked.com")) {
            System.out.println("Доступ к сайту запрещен: " + site);
        } else {
            // Если сайт разрешен, передаем работу настоящему объекту
            realInternet.connectTo(site);
        }
    }
}
