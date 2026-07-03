import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(2003, 05, 07);

        System.out.println(currentDate);
        System.out.println(birthday);

        String dateString = "30/11/2001";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate formatedDate = LocalDate.parse(dateString, formatter);
        System.out.println(formatter.format(birthday));

        System.out.println(formatedDate);

        LocalDate fiftheenBirthday = birthday.plusYears(15);

        System.out.println(fiftheenBirthday);
        System.out.println(birthday.minusWeeks(4).minusDays(2));

        System.out.println(birthday.isBefore(fiftheenBirthday));
        System.out.println(currentDate.isAfter(birthday));
        System.out.println(currentDate.isEqual(fiftheenBirthday));

        System.out.println(birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        Locale[] locales = {Locale.US, new Locale("pt", "BR"), Locale.JAPAN};

        for (Locale locale:locales) {
            System.out.println(birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale)));
        }

        System.out.println(birthday.getDayOfMonth());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getMonthValue());
        System.out.println(birthday.getYear());


    }
}
