package gmail.com.pysarevsa;



import static gmail.com.pysarevsa.DateTimeAPI.getDateTimeFromAPI;


public class Main {


    public static void main(String[] args) {

        String apiUrl = "http://worldtimeapi.org/api/timezone/Etc/UTC";

        try {

            String response = getDateTimeFromAPI(apiUrl); //отвер апи





            int dateTimeIndex = response.indexOf("\"datetime\":\"");
            if (dateTimeIndex != -1) {
                int start = dateTimeIndex + 12;
                int end = response.indexOf('T', start);
                int tstart = dateTimeIndex + 23;
                int tend= response.indexOf('.', tstart);
                String dateTime = response.substring(start, end);
                String dateTimevalue = response.substring(tstart, tend);
                System.out.println("Точная дата: " + dateTime);
                System.out.println("Точное время: " + dateTimevalue);
            } else {
                System.out.println("Поле datetime не найдено в ответе API.");
            }

        } catch (Exception e) {
            System.err.println("Ошибка при получении данных бля: " + e.getMessage());
        }


    }
}


