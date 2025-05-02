public class Book implements Cloneable {
    private String author;
    private String title;
    private String genre;
    private int publicationYear;

    public Book(String author, String title, String genre, int publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
