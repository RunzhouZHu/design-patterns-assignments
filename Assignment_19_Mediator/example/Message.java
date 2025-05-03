package example;

public class Message {
    private User sender;
    private User receiver;
    private String message;

    public Message(User sender, User receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public String getMessage() {
        return message;
    }

    public String toString() {
        return "[sender=" + sender + ", receiver=" + receiver + ", message=" + message + "]";
    }
}
