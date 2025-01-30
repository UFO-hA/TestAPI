package gmail.com.pysarevsa;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) {
        String url = ("http://api.timezonedb.com/v2.1/get-time-zone?key=4ESRG1IH1NNB&format=json&by=zone&zone=Europe/Berlin");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            DateTimeApiClient api = new DateTimeApiClient(url);
            String response = api.getDateTime();
            DateTimeModel.Example example = objectMapper.readValue(response, DateTimeModel.Example.class);
            int dateTimeIndex = response.indexOf("OK");
            String timeDate = example.getFormatted();
            if (dateTimeIndex != -1) {
                String time = timeDate.substring(11, 19);
                String date = timeDate.substring(0, 9);
                System.out.println("Точное время: " + time);
                System.out.println("Точная дата: " + date);
                System.out.println("Страна: " + example.getCountryName());
                System.out.println("Часовой пояс: " + example.getZoneName());
            } else {
                System.out.println("Поле formatted не найдено в ответе API.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка при получении данных: " + e.getMessage());
        }
    }
}
