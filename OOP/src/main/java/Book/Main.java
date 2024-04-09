package Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Тестирование Book");
        Author author1 = new Author("Джон Рональд Руэл Толкин", "MAN", "Tolkin@mail.ru");
        Book book1 = new Book("Властелин Колец", author1, 1957);
        System.out.println(book1);
        System.out.println("\nМеняем автора и книгу");
        author1.setName("Джек Лондон");
        author1.setEmail("London@yandex.ru");
        book1.setBookName("Белый клык");
        book1.setYear(1906);
        System.out.println(book1);
        System.out.println("Тестирование ");
    }
}
