import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Existem 3 tipos

        // HashMap: Mapa sem relevância quanto a ordem

        // LinkedHashMap: Mapa que mantém a ordem de inserção

        // TreeMap: Mapa capaz de classificar as chaves pela ordem natural

        Map<String, String> states = new HashMap<>();
        states.put("PI", "Piaui");
        states.put("BA", "Bahia");
        states.put("CE", "Ceara");
        states.put("SP", "São Paulo");
        states.put("RJ", "Rio de Janeiro");
        states.put("MG", "Minas Gerais");
        states.put("RS", "Rio Grande do Sul");
        states.put("PR", "Paraná");
        states.put("SC", "Santa Catarina");
        states.put("MT", "Mato Grosso");
        states.put("MS", "Mato Grosso do Sul");
        states.put("GO", "Goías");
        states.put("TO", "Tocantins");
        states.put("AC", "Acre");
        states.put("AM", "Amazonas");

        Iterator keys = states.keySet().iterator();
        while (keys.hasNext()) {
            Object key = keys.next();

            Object state = states.get(key);

            System.out.println(key + " " + state);
        }

        System.out.println("Estado SP: " + states.get("SP"));
    }
}
