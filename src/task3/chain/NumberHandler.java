package task3.chain;

// Базовый обработчик
// Хранит ссылку на следующий обработчик в цепочке
public abstract class NumberHandler {

    protected NumberHandler nextHandler;

    // Устанавливаем следующий обработчик
    public void setNextHandler(NumberHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Каждый наследник будет сам решать,
    // может ли он обработать число
    public abstract void handle(int number);
}
