import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable{
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    @Override
    public Recommendation clone() throws CloneNotSupportedException {
        Recommendation clonedRe = (Recommendation) super.clone();
        clonedRe.books = new ArrayList<>(this.books);
        for (Book book : this.books) {
            clonedRe.books.add(book.clone());
        }
        return clonedRe;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Book book : this.books) {
            s.append(book.toString()).append("\n");
        }
        return targetAudience + " has books : " + s + ".";
    }
}
