import java.sql.Connection;
import java.util.List;

public class RegisterRepository {
    private Connection connection;

    public RegisterRepository() {
        connection = Connector.getConnection();
    }

    public void insert(Register register) {
    }

    public void update(Register register) {
    }

    public void delete(Integer registerId) {
    }

    public List<Register> list() {
        return null;
    }

    public Register show() {
        return null;
    }
}
