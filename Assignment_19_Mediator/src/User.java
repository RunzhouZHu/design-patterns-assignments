public class User {
    private String name;
    private ChatRoom chatRoom;
    private ClientController controller;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void setController(ClientController controller) {
        this.controller = controller;
    }
    public ClientController getController() {
        return controller;
    }

    public String toString() {
        return name;
    }

    public void receive(Message msg) {
        msg.getReceiver().getController().receiveMessage(msg);
    }

    public void send(User receiver, String message) {
        Message msg = new Message(this, receiver, message);
        chatRoom.sendMessage(msg);
    }
}
