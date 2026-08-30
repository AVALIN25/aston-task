package task3.strategy;

// Класс персонажа, который использует стратегию
public class Character {
    private MoveStrategy moveStrategy;

    // Метод, который меняет способ передвижения.
    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    // Character не знает, как именно двигаться.
    // Он просто вызывает метод выбранной стратегии.
    public void move() {
        moveStrategy.move();
    }
}
