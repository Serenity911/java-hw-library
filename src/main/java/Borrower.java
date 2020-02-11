import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int countBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void borrowBook(Book book1) {

    }
}
