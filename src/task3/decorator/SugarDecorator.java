package task3.decorator;

// Декоратор, который добавляет сахар
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", сахар";
    }
    @Override
    public int getCost() {
        return coffee.getCost() + 10;
    }
}