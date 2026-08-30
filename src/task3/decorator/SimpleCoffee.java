package task3.decorator;

// Обычный кофе без добавок
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Обычный кофе";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
