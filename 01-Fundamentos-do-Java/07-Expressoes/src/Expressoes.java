import java.time.LocalDate;

public class Expressoes {
    public static void main(String[] args) {
        String name = "Davi Rodrigues";
        String surname = "Ferreira";
        Integer id = 5236;
        Double salary = 1239.99;
        LocalDate contractExpiration = LocalDate.of(2026, 12, 31);

        // % mascara quantidade indicadorDeInteiro
        String idFormated = String.format("%09d", id);
        System.out.println(idFormated);

        // % -(espaços fica a direita) minDeCaracteres . maxDeCaracteres
        // indicadorDeString
        String nameFormated = String.format("%-15.20s", name);
        System.out.println(nameFormated + '|');

        // % indicadorDeData <(indica que está usando o mesmo parâmetro
        // anterior) d(day, month, year ou YEAR)
        String localDateFormated = String.format("%td/%<tm/%<tY",
                contractExpiration);
        System.out.println(localDateFormated);

        // % numDoIndiceDoParametro $(indica que o numero anterior se refere
        // ao indice do parametro) indicadorDeString
        String nameSurnameFormated = String.format("%2$s %1$s", name, surname);
        System.out.println(nameSurnameFormated);
    }
}
