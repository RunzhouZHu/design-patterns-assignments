import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIFacade {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        String jsonResult = getJsonFromApi(urlString);
        return extractFromJson(jsonResult, attributeName);
    }

    // 1. Send HTTP GET request and get JSON response
    private String getJsonFromApi(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            con.disconnect();
        }
    }

    // 2. Extract the value of the given attribute name from the JSON
    private String extractFromJson(String jsonResult, String attributeName) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(jsonResult);
            if (jsonObject.get(attributeName).getClass().equals(String.class)) {
                return (String) jsonObject.get(attributeName);
            } else {
                return jsonObject.get(attributeName).toString();
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
