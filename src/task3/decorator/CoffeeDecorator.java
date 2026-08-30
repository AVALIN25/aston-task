package task3.decorator;

// Базовый декоратор
// Он хранит внутри другой объект Coffee
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
