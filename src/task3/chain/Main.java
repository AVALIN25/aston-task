package task3.chain;

// Цепочка обязанностей: три обработчика, которые по очереди
// проверяют число — положительное оно, отрицательное или ноль.

public class Main {
    public static void main(String[] args) {

        // Создаем обработчики.
        NumberHandler positiveHandler = new PositiveHandler();
        NumberHandler negativeHandler = new NegativeHandler();
        NumberHandler zeroHandler = new ZeroHandler();

        // Создаем цепочку:
        // положительное -> отрицательное -> ноль
        positiveHandler.setNextHandler(negativeHandler);
        negativeHandler.setNextHandler(zeroHandler);

        // Все числа сначала отправляем
        // первому обработчику цепочки
        positiveHandler.handle(5);
        positiveHandler.handle(-5);
        positiveHandler.handle(0);
    }

}
