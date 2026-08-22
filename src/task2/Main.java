package task2;

import java.util.Comparator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = readStudents("students.txt");


        students.stream()
                .peek(System.out::println)

                // Получаем все книги всех студентов
                .flatMap(student -> student.getBooks().stream())

                .sorted(Comparator.comparingInt(Book::getPages))

                // Убираем одинаковые книги
                .distinct()

                .filter(book -> book.getYear() > 2000)

                .limit(3)

                // Вместо книг получаем их годы выпуска
                .map(Book::getYear)

                // Берем первый найденный год и получаем Optional
                .findFirst()

                // Если год есть - выводим его, если нет - выводим сообщение
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Такая книга отсутствует")
                );
    }
    // Читает файл и возвращает готовый список студентов
    private static List<Student> readStudents(String fileName) {

        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                students.add(parseStudent(line));
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Ошибка в данных файла: " + e.getMessage());
        }

        return students;
    }
    // Разбирает одну строку файла и создает из нее студента
    private static Student parseStudent(String line) {

        String[] parts = line.split("\\|");

        String studentName = parts[0];
        List<Book> books = new ArrayList<>();

        for (int i = 1; i < parts.length; i++) {

            String[] bookData = parts[i].split(";");

            String title = bookData[0];
            String author = bookData[1];
            int pages = Integer.parseInt(bookData[2]);
            int year = Integer.parseInt(bookData[3]);

            books.add(new Book(title, author, pages, year));
        }

        return new Student(studentName, books);
    }
}