public class RegisterSystem {
    public static void main(String[] args) {
        String URL = "jdbc:sqlite:02-Ainda-Sobre-Java/02-Maven-e-JDBC" +
                "/database.db";

        Connector.connect(URL);

        RegisterRepository repository = new RegisterRepository();
        
        Register client = new Register("Flavia", "1988-02-11");
        repository.insert(client);
    }
}
