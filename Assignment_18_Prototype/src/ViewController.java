import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class ViewController {

    @FXML
    private ListView<Recommendation> bookReList;

    @FXML
    private TextField bookListText;

    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> title;
    @FXML
    private TableColumn<Book, String> author;
    @FXML
    private TableColumn<Book, String> genre;
    @FXML
    private TableColumn<Book, Integer> publicationYear;

    @FXML
    private TextField titleText;
    @FXML
    private TextField authorText;
    @FXML
    private TextField genreText;
    @FXML
    private TextField publicationYearText;


    private final BookRecommendationSystem bookRS = new BookRecommendationSystem();

    private Recommendation selectedBookList;
    private Book selectedBook;

    public void initialize() {
        updateBookReList();

        // Limit the publication year input to integer
        publicationYearText.textProperty().addListener((obs, oldVal, newVal) -> {
            if(!newVal.matches("\\d*")) {
                publicationYearText.setText(newVal.replaceAll("[^\\d*]", ""));
            }
        });
    }

    public void bookListClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1 && bookReList.getSelectionModel().getSelectedItem() != null) {
            Recommendation bookList = bookReList.getSelectionModel().getSelectedItem();
            updateBookTable(bookList);

            bookListText.setText(bookList.toString());
            selectedBookList = bookList;
        }
    }

    public void bookListCopyClicked(MouseEvent mouseEvent) {
        bookRS.cloneRecommendation(selectedBookList);

        System.out.println(bookRS.getRecommendations());
    }

    public void bookListModifyClicked(MouseEvent mouseEvent) {
        selectedBookList.setTargetAudience(bookListText.getText());
        System.out.println(bookRS.getRecommendations());
        updateBookReList();
    }

    public void addBookClicked(MouseEvent mouseEvent) {
        Book book = new Book(authorText.getText(), titleText.getText(), genreText.getText(), Integer.parseInt(publicationYearText.getText()));
        selectedBookList.addBook(book);
    }

    public void bookTableClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1 && bookTable.getSelectionModel().getSelectedItem() != null) {
            selectedBook = bookTable.getSelectionModel().getSelectedItem();
        }
    }

    public void removeBookClicked(MouseEvent mouseEvent) {
        selectedBookList.removeBook(selectedBook);
    }

    //
    private void updateBookReList() {
        bookReList.setItems(null);
        bookReList.setItems(bookRS.getRecommendations());
    }

    private void updateBookTable(Recommendation bookList) {
        bookTable.setItems(bookList.getBooks());
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        author.setCellValueFactory(new PropertyValueFactory<>("author"));
        genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        publicationYear.setCellValueFactory(new PropertyValueFactory<>("publicationYear"));
    }
}
