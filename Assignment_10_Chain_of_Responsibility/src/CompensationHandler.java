public class CompensationHandler extends Handler {
    private static final MessageType type = MessageType.COMPENSATION_CLAM;

    @Override
    public void handle(Message message) {
        if (message.getType() == type) {
            System.out.println("message: " + message.getContent() + " from: " + message.getSenderEmail());
            System.out.println("Your compensation has been reviewed!");
        } else {
            super.handle(message);
        }
    }
}
