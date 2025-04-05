public class FeedbackHandler extends Handler {
    private static final MessageType type = MessageType.GENERAL_FEEDBACK;

    @Override
    public void handle(Message message) {
        if (message.getType() == type) {
            System.out.println("message: " + message.getContent() + " from: " + message.getSenderEmail());
            System.out.println("Your feedback has been analyzed.");
        } else {
            super.handle(message);
        }
    }
}
