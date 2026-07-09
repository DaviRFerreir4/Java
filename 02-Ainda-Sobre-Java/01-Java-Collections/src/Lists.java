import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Existem 3 tipos

        // Vector: Array redimensionável com sincronização segura (obsoleto,
        // usar Collections.synchronizedList(new ArrayList<>()) ou a classe 
        // CopyOnWriteArrayList no lugar)

        // ArrayList: Array redimensionavel e indexado mais performática

        // LinkedList: Lista encadeada com mais recursos de inserção de
        // elementos

        List languages = new ArrayList<String>();
        System.out.println(languages.size());
        languages.add("Java");
        languages.add("Javascript");
        languages.add("C#");
        languages.add("Go");
        languages.add("Javascript");
        languages.remove("C#");
        languages.add(3, "Python");
        System.out.println(languages.get(3));
        System.out.println(languages.size());
        System.out.println(languages.indexOf("javascript"));
        System.out.println(languages.indexOf("Javascript"));
        System.out.println(languages.contains("Go"));
        // languages.forEach(language -> System.out.print(language + " "));
        for (Object language : languages) {
            System.out.print(language + " ");
        }
    }
}
