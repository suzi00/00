import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryClass {

    private String LibraryName;

    private List<BookClass> books = new ArrayList<>();

    public LibraryClass(String libraryName){
        this.LibraryName = libraryName;
    }a

    public void AddBookToLibrary(BookClass book){
        this.books.add(book);
    }

    public BookClass GetBookWithISBN(int ISBN){
        for (BookClass book : this.books){
            if (book.getISBN() == ISBN){
                return book;
            }
        }
        return null;
    }

    public BookClass GetBookWithAuthor(String author){
        for (BookClass book : this.books){
            if (book.getAuthor() == author){
                return book;
            }
        }
        return null;
    }

    public void removeBookWithAuthorName(String authorName){
        BookClass bookToBeFound = null;

        for (BookClass book : this.books){
            if (book.getAuthor() == authorName){
                bookToBeFound = book;
                break;
            }
        }

        this.books.remove(bookToBeFound);
    }

    public String GetAllBooksToString(){
        String booksString = "";

        for (BookClass book : this.books){
            booksString += (book.getAuthor() + " " + book.getTitle() + " " + book.getPublisher() + " " + book.getYearOfPublishing() + " " + book.getISBN());
            booksString += "\n";
        }

        return booksString;
    }
}
