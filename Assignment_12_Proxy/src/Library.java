import java.nio.file.AccessDeniedException;
import java.util.HashMap;

public class Library {
    private final HashMap<String,DocumentInterface> documents = new HashMap<>();

    public void addDocument(DocumentInterface document) {
        documents.put(document.getIdentifier(), document);
    }

    public void searchDocument(String identifier, User user) throws AccessDeniedException, ClassNotFoundException {
        DocumentInterface document = documents.get(identifier);
        if(document != null) {
            System.out.println("The user " + user.getUsername() + " is accessing " + identifier + "...");
            System.out.println(document.getContent(user));
        } else {
            throw new ClassNotFoundException("Document not found");
        }
    }

}
