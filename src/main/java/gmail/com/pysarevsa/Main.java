package gmail.com.pysarevsa;

public class Main {

    public static void main(String[] args) {
        RequestConfig config = ConfigReader.read();
        try {
            DateTimeApiClient api = new DateTimeApiClient(config);
            DateTimeModel response = api.getDateTime();
            System.out.println("Точное время: " + response.getFormatted().substring(11, 19));
            System.out.println("Точная дата: " + response.getFormatted().substring(0, 10));
            System.out.println("Страна: " + response.getCountryName());
            System.out.println("Часовой пояс: " + response.getZoneName());
        } catch (Exception e) {
            System.err.println("Ошибка при получении данных: " + e.getMessage());
        }
    }
}
