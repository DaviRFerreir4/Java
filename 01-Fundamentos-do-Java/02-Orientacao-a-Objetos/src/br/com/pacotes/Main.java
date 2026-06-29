package br.com.pacotes;

// Se não for do java.lang, precisa importar
import java.math.BigDecimal;
// import br.com.pacotes.model.User;

public class Main {
    public static void main(String[] args) {
        String name = "Davi";
        Integer age = 10;
        BigDecimal height = BigDecimal.ONE;
        System.out.println(height);

        /*
        User user = new User();
        user.showMyName();

        br.com.pacotes.model.User user2 = new br.com.pacotes.model.User();

        User user = new User();
        */

        User userLocal = new User();
        br.com.pacotes.model.User user = new br.com.pacotes.model.User();

        userLocal.showMyName();
        user.showMyName();
    }
}
