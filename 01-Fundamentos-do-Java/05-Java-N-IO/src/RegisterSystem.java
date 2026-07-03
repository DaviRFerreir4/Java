import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RegisterSystem {
    public static void main(String[] args) {
        List<Register> registers = new ArrayList<>();

        registers.add(new Register("Davi", "M", "(67) 4002-8922",
                LocalDate.of(2002, 3, 21), 3431.99, true));
        registers.add(new Register("Flavia", "F", "(67) 8435-1530",
                LocalDate.of(1979, 5, 12), 6352.99, false));
        registers.add(new Register("Sara", "F", "(67) 6385-2593",
                LocalDate.of(2000, 8, 19), 2353.99, true));
        registers.add(new Register("Paulo", "M", "(37) 1302-5946",
                LocalDate.of(1977, 12, 6), 7351.99, true));

        writeDelimitedLayout(registers);

        System.out.println("------------------------------------------");

        List<Register> registersDelimitedRead = readDelimitedLayout();
        for (Register register : registersDelimitedRead) {
            System.out.println(register.getName());
        }

        System.out.println("------------------------------------------");

        writePositionalLayout(registers);

        System.out.println("------------------------------------------");

        List<Register> registersPositionRead = readPositionalLayout();
        for (Register register : registersPositionRead) {
            System.out.println(register.getName());
        }

        System.out.println("------------------------------------------");
    }

    public static void writeDelimitedLayout(List<Register> registers) {
        System.out.println("Writing using the delimited layout approach");

        StringBuilder content = new StringBuilder();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (Register register : registers) {
            content.append(register.getName() + ";");
            content.append(register.getSex() + ";");
            content.append(register.getPhone() + ";");
            content.append(register.getBirthday().format(formatter) + ";");
            content.append(register.getSuggestedValue() + ";");
            content.append(register.getClient() + ";");
            content.append(System.lineSeparator());
        }

        try {
            Path destinyFile = Paths.get("C:\\rocket\\aula-2", "aula-java.csv");

            if (!Files.exists(destinyFile)) {
                Files.createDirectories(destinyFile.getParent());
                Files.createFile(destinyFile);
            }

            Files.write(destinyFile, content.toString()
                            .getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE);

            System.out.println("Finished writing using delimited layout " +
                    "approach");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<Register> readDelimitedLayout() {
        System.out.println("Reading using the delimited layout approach");

        List<Register> registers = new ArrayList<>();

        try {
            Path destinyFile = Paths.get("C:\\rocket\\aula-2", "aula-java.csv");

            if (!Files.exists(destinyFile)) {
                throw new RuntimeException("File doesn't exist");
            }

            List<String> content = Files.readAllLines(destinyFile);

            for (String line : content) {
                String[] cols = line.split("\\;");

                Register register = new Register(cols[0], cols[1], cols[2],
                        LocalDate.parse(cols[3]), Double.parseDouble(cols[4])
                        , cols[5] == "true");

                registers.add(register);
            }

            System.out.println("Finished reading using delimited layout " +
                    "approach");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return registers;
    }

    public static void writePositionalLayout(List<Register> registers) {
        System.out.println("Writing using the positional layout approach");

        StringBuilder content = new StringBuilder();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (Register register : registers) {
            String name = register.getName();

            if (name.length() > 30) {
                name = name.substring(0, 30);
            }

            if (name.length() < 30) {
                name = String.format("%-30s", name);
            }

            content.append(name);
            content.append(register.getSex()
                    .isEmpty() ? "N" : register.getSex().toUpperCase());
            content.append(register.getPhone()
                    .length() == 14 ? register.getPhone() : "(00) 0000-0000");
            content.append(register.getBirthday().format(formatter));
            DecimalFormat decimalFormat = new DecimalFormat("#0000.00");
            String formattedValue =
                    decimalFormat.format(register.getSuggestedValue());
            content.append(formattedValue.replaceAll("\\,", "\\."));
            content.append(register.getClient() ? "1" : "0");
            content.append(System.lineSeparator());
        }

        try {
            Path destinyFile = Paths.get("C:\\rocket\\aula-2", "aula-java" +
                    ".txt");

            if (!Files.exists(destinyFile)) {
                Files.createDirectories(destinyFile.getParent());
                Files.createFile(destinyFile);
            }

            Files.write(destinyFile, content.toString()
                            .getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE);

            System.out.println("Finished writing using positional layout " +
                    "approach");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    public static List<Register> readPositionalLayout() {
        System.out.println("Reading using the positional layout approach");

        List<Register> registers = new ArrayList<>();

        try {
            Path destinyFile = Paths.get("C:\\rocket\\aula-2", "aula-java" +
                    ".txt");

            if (!Files.exists(destinyFile)) {
                throw new RuntimeException("File doesn't exist");
            }

            List<String> content = Files.readAllLines(destinyFile);

            for (String line : content) {
                Register register = new Register(line.substring(0, 30),
                        line.substring(30, 31), line.substring(31, 45),
                        LocalDate.parse(line.substring(45, 55)),
                        Double.parseDouble(line.substring(55, 62))
                        , line.substring(62) == "1");

                registers.add(register);
            }

            System.out.println("Finished reading using positional layout " +
                    "approach");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return registers;

    }
}

class Register {
    private String name;
    private String sex;
    private String phone;
    private LocalDate birthday;
    private Double suggestedValue;
    private Boolean isClient;

    public Register(String name, String sex, String phone, LocalDate birthday
            , Double suggestedValue, Boolean isClient) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.birthday = birthday;
        this.suggestedValue = suggestedValue;
        this.isClient = isClient;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Double getSuggestedValue() {
        return suggestedValue;
    }

    public Boolean getClient() {
        return isClient;
    }
}