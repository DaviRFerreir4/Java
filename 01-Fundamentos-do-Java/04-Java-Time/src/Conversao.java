import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Conversao {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();

        LocalDate dateNow = LocalDate.now();

        LocalTime timeNow = LocalTime.now();

        awaitsLocalDate(dateTimeNow.toLocalDate());
        awaitsLocalTime(dateTimeNow.toLocalTime());
        awaitsLocalDateTime(dateNow.atTime(22, 2, 4));
        awaitsLocalDateTime(dateNow.atTime(timeNow));
        awaitsLocalDateTime(timeNow.atDate(dateNow));
    }

    static void awaitsLocalDate(LocalDate date) {
        System.out.println(date);
    }

    static void awaitsLocalTime(LocalTime time) {
        System.out.println(time);
    }

    static void awaitsLocalDateTime(LocalDateTime dateTime) {
        System.out.println(dateTime);
    }
}
