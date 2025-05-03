import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ChatRoom {
    private final ObservableList<User> users = FXCollections.observableArrayList();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public ObservableList<User> getUsers() {
        return users;
    }

    public void sendMessage(Message message) {

        for (User u : users) {
            if(u.equals(message.getReceiver())) {
                u.receive(message);
            }
        }
    }

}
