import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCSQLite {
    public static void main(String[] args) {
        String URL = "jdbc:sqlite:02-Ainda-Sobre-Java/02-Maven-e-JDBC" +
                "/database.db";

        Connection connection;

        try {
            connection = DriverManager.getConnection(URL);

            if (connection != null) {
                System.out.println("Conectado com sucesso");
            }

            String name = "Davi";
            String birthdate = "2002-07-29";

            String QUERY = "INSERT INTO Users (name, birthday) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(QUERY);
            statement.setString(1, name);
            statement.setString(2, birthdate);
            statement.execute();
            System.out.println("Cadastro inserido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
