import java.util.*;

public class Library {     // holds set of books and provides various ways to search for the books within
    private ArrayList<Book> myLibrary;              // create arraylist to hold books, with infinite spaces for the books

    public Library() {       // constructor
        this.myLibrary = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.myLibrary.add(newBook);   // add newBook to the arraylist. is newBook's parameters title/publisher/year required here? do we need String and int before the parameters?
    }

    public void printBooks() {
        for (Book printBook : this.myLibrary) {           // for each book of myLibrary, print
            System.out.println(printBook);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and all the matching books found in the list.
        // use method contains instead of equals for String objects

        for (Book findTitle : this.myLibrary) {
            if (StringUtils.included(findTitle.title(), title)) {   // new if
                found.add(findTitle);
            }
        }

        //new if statement: if (StringUtils.included(findTitle.title(), title)) {
        //old if statement: if (findTitle.title().contains(title)) {

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book findPublisher : this.myLibrary) {
            if (StringUtils.included(findPublisher.publisher(), publisher)) {  // new if
                found.add(findPublisher);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book findYear : this.myLibrary) {
            if (findYear.year() == year) {
                found.add(findYear);
            }
        }
        return found;
    }

}