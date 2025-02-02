package gmail.com.pysarevsa;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;


public class DateTimeApiClient {
    private final String url;

    public DateTimeApiClient(String url) {
        this.url = url;
    }

    public DateTimeModel getDateTime() throws Exception {
        URL url = new URI(this.url).toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            DateTimeModel dataTime = new ObjectMapper().readValue(response.toString(), DateTimeModel.class);
            return dataTime;
        }
    }
}


