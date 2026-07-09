import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Existem 3 tipos:

        // HashSet: Coleção exclusiva (não aceita duplicidade), não ordenada e
        // de alto desempenho

        // LinkedHashSet: Coleção exclusiva e ordenada pela inserção

        // TreeSet: Coleção exclusiva, ordenada e classificada pela ordem
        // natural dos elementos

        Set languages = new TreeSet();
        System.out.println(languages.size());
        languages.add("Java");
        languages.add("Go");
        languages.add("Javascript");
        languages.add("Python");
        languages.add("C#");
        languages.add("Javascript");
        // Impossível recuperar o elementos por indices
        // System.out.println(languages.get(3));
        // System.out.println(languages.indexOf("Javascript"));
        languages.remove("C#");
        System.out.println(languages.size());
        System.out.println(languages.contains("Go"));
        // languages.forEach(language -> System.out.print(language + " "));
        for (Object language : languages) {
            System.out.print(language + " ");
        }
    }
}
