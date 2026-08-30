package task3.builder;

public class Main {
    public static void main(String[] args) {

        // Создаем Person с помощью билдера
        Person person = new Person.Builder()
                .setName("Ivan")
                .setAge(25)
                .setCity("Moscow")
                .build();

        person.printInfo();
    }
}
