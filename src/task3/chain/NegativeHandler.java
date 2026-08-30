package task3.chain;

// Обработчик отрицательных чисел
public class NegativeHandler extends NumberHandler {
    @Override
    public void handle(int number) {

        if (number < 0) {
            System.out.println("Число отрицательное");
        } else if (nextHandler != null) {
            // Передаем следующему обработчику
            nextHandler.handle(number);
        }
    }

}
