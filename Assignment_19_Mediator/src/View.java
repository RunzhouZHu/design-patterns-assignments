import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class View extends Application {

    ChatRoom chatRoom = new ChatRoom();
    User user1 = new User("user1", chatRoom);
    User user2 = new User("user2", chatRoom);
    User user3 = new User("user3", chatRoom);

    @Override
    public void start(Stage stage) throws Exception {
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        startUserClients();

        System.out.println(chatRoom.getUsers());
    }

    public static void main(String[] args) {
        launch(args);
    }

    //
    private void startUserClients() throws IOException {
        for (User user : chatRoom.getUsers()) {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view.fxml"));
            Parent root = fxmlLoader.load();
            ClientController controller = fxmlLoader.getController();
            controller.setUser(user);
            controller.setChatRoom(chatRoom);
            controller.initialize();
            user.setController(controller);
            stage.setTitle(String.valueOf(user));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}
