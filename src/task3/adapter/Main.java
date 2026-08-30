package task3.adapter;

// Телефон умеет заряжаться только через USB-C
// а у нас есть старая зарядка с другим интерфейсом
// Адаптер позволит использовать старую зарядку там, где ожидается USB-C
public class Main {
    public static void main(String[] args) {

        // Создаем старую зарядку
        OldCharger oldCharger = new OldCharger();

        // Подключаем старую зарядку через адаптер
        UsbC adapter = new ChargerAdapter(oldCharger);

        // Телефон работает с адаптером как с обычным UsbC
        Phone phone = new Phone();

        phone.startCharging(adapter);
    }
}
