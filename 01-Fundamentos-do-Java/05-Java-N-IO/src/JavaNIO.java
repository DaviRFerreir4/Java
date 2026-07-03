import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\curso", "aula-java.txt");

            if (!Files.exists(path)) {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
            }

            byte[] fileBytes = Files.readAllBytes(path);

            String contentFromBytes = new String(fileBytes);
            System.out.println(contentFromBytes);

            String contentFromString = Files.readString(path);
            System.out.println(contentFromString);

            List<String> contentList = Files.readAllLines(path);
            System.out.println(contentList);

            String contentToWrite = "Paulo";
            Files.write(path, contentToWrite.getBytes(StandardCharsets.UTF_8));

            List<String> names = new ArrayList<>();

            names.add("Davi");
            names.add("Sara");
            names.add("Flavia");
            names.add("Paulo");

            StringBuilder namesString = new StringBuilder();

            names.forEach(n -> namesString.append(n + "\n"));

            Files.write(path, namesString.toString()
                    .getBytes(StandardCharsets.UTF_8));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
