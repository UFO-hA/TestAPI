package gmail.com.pysarevsa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;

public class DateTimeApiClient {
    private final String url;

    public DateTimeApiClient(String url) {
        this.url = url;
    }

    public String getDateTime() throws Exception { //получение ответа API
        URI url = new URI(this.url).toURL().toURI();
        HttpURLConnection connection = (HttpURLConnection) url.toURL().openConnection();
        connection.setRequestMethod("GET");  // настройка запроса
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }
}


