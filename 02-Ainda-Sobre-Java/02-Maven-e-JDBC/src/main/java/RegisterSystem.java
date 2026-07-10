import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class RegisterSystem {
    public static void main(String[] args) {
        String URL = "jdbc:sqlite:02-Ainda-Sobre-Java/02-Maven-e-JDBC" +
                "/database.db";

        Connector.connect(URL);

        RegisterRepository repository = new RegisterRepository();

        Register client = new Register("Sara Ferreira", "2001-05-22", 3);
        // repository.insert(client);

        // repository.update(client);

        // repository.delete(client.getRowid());

        // List<Register> registerList = repository.list();
        // for (Register register : registerList) {
        //     DateTimeFormatter formatter =
        //             DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //     LocalDate birthday = LocalDate.parse(register.getBirthdate(),
        //             formatter);
        //
        //     String message = String.format("Id: %03d | Nome: %-20.20s | " +
        //                     "Birthdate: %td/%<tm/%<tY", register.getRowid(),
        //             register.getName(), birthday);
        //     System.out.println(message);
        // }

        Register register = repository.show(3);
        if (register != null) {
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthday = LocalDate.parse(register.getBirthdate(),
                    formatter);

            String message = String.format("Id: %03d | Nome: %-20.20s | " +
                            "Birthdate: %td/%<tm/%<tY", register.getRowid(),
                    register.getName(), birthday);
            System.out.println(message);
        } else {
            System.out.println("Cadastro não encontrado");
        }
    }
}
