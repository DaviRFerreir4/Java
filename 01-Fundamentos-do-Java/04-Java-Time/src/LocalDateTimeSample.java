import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;

public class LocalDateTimeSample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime birthday = LocalDateTime.of(2003, 5, 7, 2, 35, 23);

        System.out.println(birthday.plusYears(2).minusMonths(3).plusHours(5)
                .minusMinutes(34));

        System.out.println(birthday.withDayOfMonth(2));

        System.out.println(birthday.equals(now));
        System.out.println(birthday.getDayOfMonth() == now.getDayOfMonth());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM" +
                "/yyyy HH:mm:ss");

        System.out.println(now.format(formatter));
    }
}
