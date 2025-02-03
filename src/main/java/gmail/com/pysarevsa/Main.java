package gmail.com.pysarevsa;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        RequestConfig config = new RequestConfig();
        config.setUri("http://api.timezonedb.com/v2.1/get-time-zone");
        Map<String, String> params = new HashMap<>();
        params.put("key", "4ESRG1IH1NNB");
        params.put("format", "json");
        params.put("by", "zone");
        params.put("zone", "Europe/Berlin");
        config.setQueryParams(params);
        try {
            DateTimeApiClient api = new DateTimeApiClient(config);
            DateTimeModel response = api.getDateTime();
            System.out.println("Точное время и дата: " + response.getFormatted());
            System.out.println("Точное время: " + response.getFormatted().substring(11, 19));
            System.out.println("Точная дата: " + response.getFormatted().substring(0, 10));
            System.out.println("Страна: " + response.getCountryName());
            System.out.println("Часовой пояс: " + response.getZoneName());
        } catch (Exception e) {
            System.err.println("Ошибка при получении данных: " + e.getMessage());
        }
    }
}
