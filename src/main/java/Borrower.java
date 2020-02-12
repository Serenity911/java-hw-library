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

    public boolean hasBorrowed(Book book) {
        return this.borrowedBooks.contains(book);
    }

    public void borrowBook(Library library, Book book){
        if(library.hasBookInStock(book)) {
            this.borrowedBooks.add(library.lendBook(book));
        }
    }

//    the way it is done below won't work correctly. The book is removed within the if evaluation therefore the value that is passed into borrowed books is null - which increases its length of 1.
//    public void borrowBook(Library library, Book book){
//        if(library.lendBook(book) != null) {
//            this.borrowedBooks.add(library.lendBook(book));
//        }
//    }
}
