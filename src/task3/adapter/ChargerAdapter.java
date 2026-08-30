package task3.adapter;

// Адаптер позволяет использовать OldCharger
// как объект типа UsbC
public class ChargerAdapter implements UsbC {
    private OldCharger oldCharger;
    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }
    @Override
    public void charge() {

        // Адаптер вызывает метод старой зарядки
        oldCharger.oldCharge();
    }
}
