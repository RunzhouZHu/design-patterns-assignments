import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Demonstrate that the Chuck Norris joke can still be retrieved.
        APIFacade apiFacade = new APIFacade();
        String result =  apiFacade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
        System.out.println(result);

        String result1 =  apiFacade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "rates");
        System.out.println(result1);
    }
}