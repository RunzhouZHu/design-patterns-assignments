import java.util.HashMap;

public enum AccessControllerService {
    INSTANCE;
    public static AccessControllerService getInstance() {
        return INSTANCE;
    }

    //
    private final HashMap<String, String> accessMap = new HashMap<>();

    public void addAccessPair(String identifier, String access) {
        accessMap.put(identifier, access);
    }

    public boolean checkAccess(String identifier, String access) {
        return accessMap.containsKey(identifier)&&accessMap.get(identifier).equals(access);
    }
}
