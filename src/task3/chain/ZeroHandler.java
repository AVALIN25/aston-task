package task3.chain;

// Обработчик нуля
public class ZeroHandler extends NumberHandler {

    @Override
    public void handle(int number) {

        if (number == 0) {
            System.out.println("Число равно нулю");
        } else if (nextHandler != null) {
            nextHandler.handle(number);
        }
    }

}
