package Book;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int year;

    public Book(String BookName, Author BookAuthor, int year) {
        this.bookName = BookName;
        this.bookAuthor = BookAuthor;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String BookName) {
        this.bookName = bookName;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author BookAuthor) {
        this.bookAuthor = BookAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга '" + bookName + "', была написана в " + year + " году. \nАвтор:\t" + bookAuthor;
    }

}
