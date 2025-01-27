package gmail.com.pysarevsa;
import static gmail.com.pysarevsa.DateTimeAPI.getDateTime;

public class Main {
    public static void main(String[] args) {
        UrlApi UrlApi = new UrlApi("http://api.timezonedb.com/v2.1/get-time-zone?key=4ESRG1IH1NNB&format=json&by=zone&zone=Europe/Berlin"); //Новый API с ключём. Пока только для региона Europe/Berlin
        /* В дальнейшем планирую добавить ключь отдельным файлом и возможность настройки
        * региона. У данного API есть функция определения местонахождения по ip.
        * но эта опция платная */
        String url = UrlApi.getUrl();
        try {
            String response = getDateTime(url);
            int dateTimeIndex = response.indexOf("\"formatted\":");
            if (dateTimeIndex != -1) {
                int timeStart = dateTimeIndex + 25;
                int timeEnd = response.indexOf('\"', timeStart);
                int dateStart = dateTimeIndex + 14;
                int dateEnd = response.indexOf(' ', dateStart);
                String Date = response.substring(dateStart, dateEnd);
                String Time = response.substring(timeStart, timeEnd);
                System.out.println("Точное время: " + Time);
                System.out.println("Точная дата: " + Date);
            } else {
                System.out.println("Поле formatted не найдено в ответе API.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка при получении данных: " + e.getMessage());
        }
    }
}
