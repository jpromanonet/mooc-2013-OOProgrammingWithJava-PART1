import java.util.*;

public class Book {    // single book
    private String bookTitle;
    private String bookPublisher;
    private int bookYear;

    public Book(String title, String publisher, int year) {
        this.bookTitle = title;
        this.bookPublisher = publisher;
        this.bookYear = year;
    }

    public String title() {
        return this.bookTitle;
    }

    public String publisher() {
        return this.bookPublisher;
    }

    public int year() {
        return this.bookYear;
    }

    public String toString() {
        return this.bookTitle + ", " + this.bookPublisher + ", " + this.bookYear + "";     // last "" might not be necessary
    }
}