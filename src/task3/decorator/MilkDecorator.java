package task3.decorator;

// Декоратор, который добавляет молоко
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", молоко";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 30;
    }
}
