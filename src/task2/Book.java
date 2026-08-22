package task2;

import java.util.Objects;
public class Book {
    private String title;
    private String author;
    private int pages;
    private int year;

    // Создаем книгу и заполняем ее данными
    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    // Возвращает количество страниц. Будем использовать при сортировке
    public int getPages() {
        return pages;
    }

    // Возвращает год выпуска. Нужен для фильтрации книг
    public int getYear() {
        return year;
    }

    // Сравниваем книги, чтобы distinct() мог убрать повторяющиеся
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return pages == book.pages
                && year == book.year
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages, year);
    }

    // Нормальный вывод книги вместо адреса объекта
    @Override
    public String toString() {
        return title + ", " + author + ", " + year + ", " + pages + " стр.";
    }
}

