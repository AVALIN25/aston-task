package task1;

public class Main {
    public static void main(String[] args) {

    StringBuilder name = new StringBuilder("Ivan");

    ImmutablePerson person = new ImmutablePerson(name);

    System.out.println(person.getName()); // Ivan

    // Изменяем исходный StringBuilder
    name.append(" Petrov");

    System.out.println(name);
    System.out.println(person.getName());

    // Пытаемся изменить значение через getter
    person.getName().append(" Sidorov");

    System.out.println(person.getName()); // Ivan
}
}


// Наш иммутабельный класс
final class ImmutablePerson {

    private final StringBuilder name;

    public ImmutablePerson(StringBuilder name) {
        // Создаем копию изменяемого объекта
        this.name = new StringBuilder(name);
    }

    public StringBuilder getName() {
        // Не отдаем внутренний объект, а возвращаем его копию
        return new StringBuilder(name);
    }
}
