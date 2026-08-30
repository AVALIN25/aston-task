package task3.proxy;

// Настоящий объект, который подключается к сайту
public class RealInternet implements Internet {
    @Override
    public void connectTo(String site) {
        System.out.println("Успешно подключились к сайту: " + site);
    }
}
