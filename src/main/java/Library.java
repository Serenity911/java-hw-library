import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(!isFull()) {
            this.books.add(book);
        }
    }

    public boolean isFull(){
        return countBooks() == this.capacity;
    }


    public boolean hasBookInStock(Book book) {
        return this.books.contains(book);
    }

    public Book lendBook(Book book) {
        Book lendedBook;
        if(hasBookInStock(book)){
            this.books.remove(book);
            lendedBook = book;
            return lendedBook;
        }
        return null;
    }
}
