package task3.strategy;

// Вторая стратегия: бег
public class RunStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Персонаж бежит");
    }
}
