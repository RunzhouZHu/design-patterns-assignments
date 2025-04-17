import java.nio.file.AccessDeniedException;

public interface DocumentInterface {
    String getIdentifier();
    String getCreationDate();
    String getContent(User user) throws AccessDeniedException;
}
