package task2;
import java.util.List;
public class Student {
    private String name;
    private List<Book> books;

    // Создаем студента и передаем ему список книг
    public Student(String name, List<Book> books) {
        if (books.size() < 5) {
            throw new IllegalArgumentException(
                    "У студента должно быть минимум 5 книг"
            );
        }

        this.name = name;
        this.books = books;
    }
    // Возвращает книги студента.
    public List<Book> getBooks() {
        return books;
    }

    // Так студент будет понятно выводиться в консоль
    @Override
    public String toString() {
        return "Студент: " + name + ", книги: " + books;
    }
}

