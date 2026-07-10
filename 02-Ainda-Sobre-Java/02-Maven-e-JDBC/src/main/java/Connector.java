import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private static Connection connection;

    public static void connect(String URL) {
        try {
            connection = DriverManager.getConnection(URL);

            if (connection != null) {
                System.out.println("Conectado com sucesso");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
