import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ClientController {
    private User user;
    private ChatRoom chatRoom;

    public void setUser(User user) {
        this.user = user;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @FXML
    private Label usernamelbl;
    @FXML
    private ListView<User> userList;
    @FXML
    private Label receiverlbl;
    @FXML
    private TextField input;
    @FXML
    private TextArea chatArea;

    private User receiver;
    private String content = "";

    public void initialize() {
        setUsernamelbl(user);
        updateUserList();
    }

    public void setUsernamelbl(User user) {
        if (user != null) {
            usernamelbl.setText(String.valueOf(user));
        }
    }

    public void updateUserList() {
        if (chatRoom != null) {
            userList.setItems(chatRoom.getUsers());
        }
    }

    public void userListClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1 && userList.getSelectionModel().getSelectedItem() != null) {
            receiver = userList.getSelectionModel().getSelectedItem();
            receiverlbl.setText(String.valueOf(receiver));
            input.setDisable(receiver == user || receiver == null);
        }
    }

    public void sendButtonClicked(MouseEvent mouseEvent) {
        if (!input.getText().isEmpty()) {
            sendMessage();
        }
    }

    //
    public void sendMessage() {
        content += user + ": " + "\n" + input.getText() + "\n" + "\n";
        user.send(receiver, input.getText());

        chatArea.setText(content);
    }

    public void receiveMessage(Message message) {
        content += message.getSender() + ": " + "\n" + message.getMessage() + "\n" + "\n";

        chatArea.setText(content);
    }
}
