public class Main {
    public static void main(String[] args){
        Library library = new Library();
        DocumentInterface unprotectedDocument1 = new  Document("1-1-1", "2025-04-17", "Document 1 content.");
        DocumentInterface protectedDocument1 = new DocumentProxy("2-1-1", "2025-04-17", "Document 2 content.");
        DocumentInterface protectedDocument2 = new DocumentProxy("2-1-2", "2025-04-17", "Document 3 content.");
        User user1 = new User("user1");
        User user2 = new User("user2");

        library.addDocument(unprotectedDocument1);
        library.addDocument(protectedDocument1);
        library.addDocument(protectedDocument2);

        AccessControllerService service = AccessControllerService.getInstance();
        service.addAccessPair(user1.getUsername(), protectedDocument1.getIdentifier());
        service.addAccessPair(user2.getUsername(), protectedDocument2.getIdentifier());

        //
        System.out.println("Document not found:");
        library.searchDocument("3-3-3", user1);
        System.out.println("------------------------------------------");

        System.out.println("User get unprotected Document:");
        library.searchDocument("1-1-1", user1);
        System.out.println("------------------------------------------");

        System.out.println("User get protected Document with permission:");
        library.searchDocument("2-1-1", user1);
        System.out.println("------------------------------------------");

        System.out.println("User get protected Document without permission:");
        library.searchDocument("2-1-1", user2);
    }
}