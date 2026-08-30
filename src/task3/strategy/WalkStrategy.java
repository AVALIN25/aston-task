package task3.strategy;

// Первая стратегия: ходьба
public class WalkStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Персонаж идет пешком");

    }
}
