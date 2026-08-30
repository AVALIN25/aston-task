package task3.builder;

// Класс человека, объект которого мы будем создавать через билдер
public class Person {
    private String name;
    private int age;
    private String city;

    // Конструктор private, чтобы объект Person
    // создавался через билдер
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    // Вложенный класс билдера
    public static class Builder {

        private String name;
        private int age;
        private String city;

        // Устанавливаем имя
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        // Устанавливаем возраст
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        // Устанавливаем город
        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        // Создаем готовый объект Person
        public Person build() {
            return new Person(this);
        }
    }

    // Вывод информации о человеке
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Город: " + city);
    }
}
