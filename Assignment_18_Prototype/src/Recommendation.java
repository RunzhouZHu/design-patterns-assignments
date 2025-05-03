import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Recommendation implements Cloneable{
    private String targetAudience;
    private ObservableList<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = FXCollections.observableArrayList();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    // Getter and Setter
    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public ObservableList<Book> getBooks() {
        return books;
    }

    @Override
    public Recommendation clone() throws CloneNotSupportedException {
        try {
            Recommendation clonedRe =   (Recommendation) super.clone();
            clonedRe.books = FXCollections.observableArrayList();
            clonedRe.books.addAll(books);
            return clonedRe;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return targetAudience;
    }
}
