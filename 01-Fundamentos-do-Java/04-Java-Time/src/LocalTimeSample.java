import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalTimeSample {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime lunch = LocalTime.of(12, 5, 7);

        System.out.println(currentTime);
        System.out.println(lunch);

        String timeString = "231153";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");

        LocalTime formatedTime = LocalTime.parse(timeString, formatter);
        System.out.println(formatter.format(lunch));

        System.out.println(formatedTime);

        LocalTime lunchEnd = lunch.plusHours(1);

        System.out.println(lunchEnd);
        System.out.println(lunch.minusMinutes(23).plusSeconds(41));

        System.out.println(lunch.isBefore(lunchEnd));
        System.out.println(currentTime.isAfter(lunch));
        System.out.println(currentTime.equals(lunchEnd));

        System.out.println(lunch.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
                .withLocale(Locale.forLanguageTag("pt-BR"))));
        System.out.println(lunch.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)
                .withLocale(Locale.forLanguageTag("pt-BR"))
                .withZone(ZoneId.systemDefault())));
        System.out.println(lunch.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)
                .withLocale(Locale.forLanguageTag("pt-BR"))
                .withZone(ZoneId.systemDefault())));

        Locale[] locales = {Locale.US, Locale.forLanguageTag("pt-BR"),
                Locale.JAPAN};

        for (Locale locale : locales) {
            System.out.println(lunch.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
                    .withLocale(locale)));
        }

        System.out.println(lunch.getHour());
        System.out.println(lunch.getMinute());
        System.out.println(lunch.getSecond());
    }
}
