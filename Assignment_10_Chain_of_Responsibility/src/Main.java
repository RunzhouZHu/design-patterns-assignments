import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        FeedbackHandler feedbackHandler = new FeedbackHandler();
        SuggestionHandler suggestionHandler = new SuggestionHandler();
        ContactHandler contactHandler = new ContactHandler();
        CompensationHandler compensationHandler = new CompensationHandler();

        // Set handler chains
        suggestionHandler.setNext(feedbackHandler);
        contactHandler.setNext(suggestionHandler);
        compensationHandler.setNext(contactHandler);

        // Create messages
        ArrayList<Message> messages = new ArrayList<>();
        messages.add(new Message(MessageType.COMPENSATION_CLAM, "I want compensation!", "customer1@email.com"));
        messages.add(new Message(MessageType.CONTACT_REQUEST, "Please contact me.", "customer2@email.com"));
        messages.add(new Message(MessageType.DEVELOPER_SUGGESTION, "This is a suggestion.", "customer3@email.com"));
        messages.add(new Message(MessageType.GENERAL_FEEDBACK, "Feedback.", "customer4@email.com"));

        for (Message message : messages) {
            compensationHandler.handle(message);
        }
    }
}