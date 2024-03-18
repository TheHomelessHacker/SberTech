package Book;

class Main{
    public static void main(String[] args) {
        Author author1 = new Author("Джон Рональд Руэл Толкин", "MAN", "Tolkin@mail.ru");
        Book book1 = new Book("Властелин Колец", author1, 1957);
        System.out.println(book1);
        System.out.println("\nМеняем автора и книгу");
        author1.setName("Джек Лондон");
        author1.setEmail("London@yandex.ru");
        book1.setBookName("Белый клык");
        book1.setYear(1906);
        System.out.println(book1);
    }
}

class Book {
    private String BookName;
    private Author BookAuthor;
    private int year;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public Author getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(Author BookAuthor) {
        this.BookAuthor = BookAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга '" + BookName + "', была написана в " + year + " году. \nАвтор:\t" + BookAuthor;
    }

    public static void main(String[] args) {
    }

    protected Book(String BookName, Author BookAuthor, int year){
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.year = year;
    }

}

class Author {
    private String name;
    private String sex;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "\n\t" + name + "\nПол: \n\t" + sex + "\nПочта: \n\t" + email;
    }

    protected Author(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
}

