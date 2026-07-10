import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegisterRepository {
    private Connection connection;

    public RegisterRepository() {
        connection = Connector.getConnection();
    }

    public void insert(Register register) {
        String QUERY = "INSERT INTO Users (name, birthday) VALUES (?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(QUERY);

            statement.setString(1, register.getName());
            statement.setString(2, register.getBirthdate());

            statement.execute();

            System.out.println("Cadastro inserido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(Register register) {
        String QUERY = "UPDATE Users SET name = ?, birthday = ? WHERE rowid " +
                "= ?";

        try {
            PreparedStatement statement = connection.prepareStatement(QUERY);

            statement.setString(1, register.getName());
            statement.setString(2, register.getBirthdate());
            statement.setInt(3, register.getRowid());

            statement.execute();

            System.out.println("Cadastro atualizado com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(Integer registerRowid) {
        String QUERY = "DELETE FROM Users WHERE rowid = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(QUERY);

            statement.setInt(1, registerRowid);

            statement.execute();

            System.out.println("Cadastro excluido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Register> list() {
        String QUERY = "SELECT rowid, * FROM Users";
        List<Register> registerList = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(QUERY);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int rowid = result.getInt(1);
                String name = result.getString(2);
                String birthdate = result.getString(3);
                registerList.add(new Register(name, birthdate, rowid));
            }
            System.out.println("Cadastros retornados com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return registerList;
    }

    public Register show(Integer registerRowid) {
        String QUERY = "SELECT rowid, * FROM Users WHERE rowid = ?";
        Register register = null;

        try {
            PreparedStatement statement = connection.prepareStatement(QUERY);
            statement.setInt(1, registerRowid);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                int rowid = result.getInt(1);
                String name = result.getString(2);
                String birthdate = result.getString(3);
                register = new Register(name, birthdate, rowid);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return register;
    }
}
