import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // <generic para definir tipo da lista>
        List<String> shelf = new ArrayList();

        shelf.add("Livro");
        shelf.add("CD");
        shelf.add("Cartuchos");
        shelf.add("Figures");
        // Só strings são permitidas
        // shelf.add(1);
        // shelf.add(false);

        Collections.shuffle(shelf);

        for (String item : shelf) {
            System.out.println(item);
        }

        System.out.println("--------------");

        Collections.sort(shelf);

        for (String item : shelf) {
            System.out.println(item);
        }

        System.out.println("--------------");

        Collections.reverse(shelf);

        for (String item : shelf) {
            System.out.println(item);
        }
    }
}
