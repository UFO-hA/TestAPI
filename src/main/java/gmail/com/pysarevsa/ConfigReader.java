package gmail.com.pysarevsa;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ConfigReader {

    public static RequestConfig read() {
        RequestConfig config = new RequestConfig();

        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("application.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            config.setUri(prop.getProperty("uri"));
            Map<String, String> map = new HashMap<>();
            map.put("format", "json");
            map.put("by", "zone");

            String keyProperty = prop.getProperty("key");
            String keyEnvironment = System.getenv("API_KEY");
            //System.out.printf("Api key from properties: %s from environment: %s\n", keyProperty, keyEnvironment);
            map.put("key", Objects.nonNull(keyEnvironment) ? keyEnvironment : keyProperty);
            map.put("zone", prop.getProperty("zone"));
            config.setQueryParams(map);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return config;
    }

}
