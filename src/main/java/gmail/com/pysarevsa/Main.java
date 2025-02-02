package gmail.com.pysarevsa;


public class Main {

    public static void main(String[] args) {


        String url = ("http://api.timezonedb.com/v2.1/get-time-zone?key=4ESRG1IH1NNB&format=json&by=zone&zone=Europe/Berlin");

        try {
            DateTimeApiClient api = new DateTimeApiClient(url);
            DateTimeModel response = api.getDateTime();
            //System.out.println("Точное время и дата: " + response.getFormatted());
            System.out.println("Точное время: " + response.getFormatted().substring(11, 19));
            System.out.println("Точная дата: " + response.getFormatted().substring(0, 10));
            System.out.println("Страна: " + response.getCountryName());
            System.out.println("Часовой пояс: " + response.getZoneName());


        } catch (Exception e) {
            System.err.println("Ошибка при получении данных: " + e.getMessage());
        }

    }
}
