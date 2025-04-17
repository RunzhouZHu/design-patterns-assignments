import java.nio.file.AccessDeniedException;

public class DocumentProxy implements DocumentInterface {
    private final String identifier;
    private final String creationDate;
    private final String content;
    private Document document;

    public DocumentProxy(String identifier, String creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (document == null) {
            document = new Document(identifier, creationDate, content);
        }
        // check access here
        AccessControllerService accessControllerService = AccessControllerService.getInstance();
        if (accessControllerService.checkAccess(user.getUsername(), document.getIdentifier())) {
            System.out.println(user.getUsername() + " access granted");
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("User have no permission.");
        }
    }
}
