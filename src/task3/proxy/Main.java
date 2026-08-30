package task3.proxy;

// Есть интернет, через который можно открыть сайт. А ProxyInternet будет стоять
// перед настоящим интернетом и проверять, не заблокирован ли сайт.
public class Main {
    public static void main(String[] args) {

        // Работаем через Proxy
        Internet internet = new ProxyInternet();

        internet.connectTo("google.com");
        internet.connectTo("blocked.com");
        internet.connectTo("youtube.com");
    }
}
