public class Document implements DocumentInterface {
    private final String identifier;
    private final String creationDate;
    private String content;

    public Document(String identifier, String creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getContent(User user) {
        System.out.println("Get content successful: ");
        return content;
    }
}
