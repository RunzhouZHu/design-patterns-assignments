package example;

public class ConcreteUser extends User {
    public ConcreteUser(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }

    @Override
    public void receive(Message msg) {
        System.out.println(name +" received "+msg);
    }

    public void send(User receiver, String message) {
        Message msg = new Message(this, receiver, message);
        chatRoom.sendMessage(msg);
    }
}
