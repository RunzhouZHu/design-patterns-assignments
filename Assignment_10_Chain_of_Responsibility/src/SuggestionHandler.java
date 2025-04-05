public class SuggestionHandler extends Handler {
    private static final MessageType type = MessageType.DEVELOPER_SUGGESTION;

    @Override
    public void handle(Message message) {
        System.out.println("message: " + message.getContent() + " from: " + message.getSenderEmail());
        if (message.getType() == type) {
            System.out.println("Your suggestions have been logged and prioritized.");
        } else {
            super.handle(message);
        }
    }

}
