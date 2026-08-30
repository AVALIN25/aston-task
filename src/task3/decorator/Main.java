package task3.decorator;

// Есть обычный кофе, мы можем «оборачивать» его
// добавками — молоком и сахаром
public class Main {
    public static void main(String[] args) {

        // Создаем обычный кофе
        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getDescription());
        System.out.println("Цена: " + coffee.getCost());

        // Добавляем молоко
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Цена: " + coffee.getCost());

        // Добавляем сахар
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Цена: " + coffee.getCost());

        // Кофе с сахаром, но без молока
        Coffee coffeesugar = new SimpleCoffee();
        coffeesugar = new SugarDecorator(coffeesugar);

        System.out.println(coffeesugar.getDescription());
        System.out.println("Цена: " + coffeesugar.getCost());
    }
}

