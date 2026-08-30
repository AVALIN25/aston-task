package task3.chain;

// Обработчик положительных чисел
public class PositiveHandler extends NumberHandler {
    @Override
    public void handle(int number) {

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (nextHandler != null) {
            // Если этот обработчик не подошел,
            // передаем число дальше по цепочке
            nextHandler.handle(number);
        }
    }
}
