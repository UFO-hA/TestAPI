import org.junit.jupiter.api.Test;

public class apitest {

@Test
public static void main(String[] args) {
    String response = "{\n" +
            "  \"utc_offset\": \"+01:00\",\n" +
            "  \"timezone\": \"Europe/Berlin\",\n" +
            "  \"day_of_week\": 0,\n" +
            "  \"day_of_year\": 12,\n" +
            "  \"datetime\": \"2025-01-12T17:41:24.264632+01:00\",\n" +
            "  \"utc_datetime\": \"2025-01-12T16:41:24.264632+00:00\",\n" +
            "  \"unixtime\": 1736700084,\n" +
            "  \"raw_offset\": 3600,\n" +
            "  \"week_number\": 2,\n" +
            "  \"dst\": false,\n" +
            "  \"abbreviation\": \"CET\",\n" +
            "  \"dst_offset\": 0,\n" +
            "  \"dst_from\": null,\n" +
            "  \"dst_until\": null,\n" +
            "  \"client_ip\": \"2a02:3035:b6c:5024:7497:cb2a:eea6:b140\"\n" +
            "}";
}
}
