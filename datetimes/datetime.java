package datetimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class datetime {
    public static void  main(String[] args){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        Instant instant = Instant.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
        System.out.println(instant);
    }
}
