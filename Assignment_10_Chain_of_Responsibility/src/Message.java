public class Message {
    private final MessageType type;
    private final String content;
    private final String senderEmail;

    public Message(MessageType type, String content, String senderEmail) {
        this.type = type;
        this.content = content;
        this.senderEmail = senderEmail;
    }

    public String getContent() {
        return content;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public MessageType getType() {
        return type;
    }
}
