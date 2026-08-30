package task3.adapter;

// Телефон умеет работать только с интерфейсом UsbC
public class Phone {
    public void startCharging(UsbC charger) {
        charger.charge();
        System.out.println("Телефон заряжается");
    }
}
