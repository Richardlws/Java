package datetimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void main(String[] args) {
        /*LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        Instant instant = Instant.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
        System.out.println(instant);

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDate date = LocalDate.of(2024,12,25);

        System.out.println(date);*/

        LocalDateTime date1 = LocalDateTime.of(2025, 1, 2, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);


        System.out.println(date1);
        System.out.println(date2);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than" + date2);
        }


    }
}
