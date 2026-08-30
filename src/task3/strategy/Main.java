package task3.strategy;

public class Main {
    public static void main(String[] args) {

        Character character = new Character();

        // Выбираем стратегию ходьбы.
        character.setMoveStrategy(new WalkStrategy());
        character.move();

        // Меняем стратегию на бег.
        character.setMoveStrategy(new RunStrategy());
        character.move();
    }
}
