package example;

abstract class User {
    protected String name;
    protected ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String toString() {
        return this.name;
    }

    abstract public void receive(Message msg);
    abstract public void send(User receiver, String message);
}
