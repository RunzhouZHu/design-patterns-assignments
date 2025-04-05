public class ContactHandler extends Handler {
    private static final MessageType type = MessageType.CONTACT_REQUEST;

    @Override
    public void handle(Message message) {
        if (message.getType() == type) {
            System.out.println("message: " + message.getContent() + " from: " + message.getSenderEmail());
            System.out.println("Your contact request has been sent to the appropriate department.");
        } else {
            super.handle(message);
        }
    }

}
