import java.nio.file.AccessDeniedException;
import java.util.HashMap;

public class Library {
    private final HashMap<String,DocumentInterface> documents = new HashMap<>();

    public void addDocument(DocumentInterface document) {
        documents.put(document.getIdentifier(), document);
    }

    public void searchDocument(String identifier, User user) {
        DocumentInterface document = documents.get(identifier);
        System.out.println("The user " + user.getUsername() + " is accessing " + identifier + "...");
        if(document != null) {
            try {
                System.out.println(document.getContent(user));
            } catch (AccessDeniedException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println("Document " + identifier + " not found");
        }
    }
}
