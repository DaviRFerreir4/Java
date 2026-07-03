import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File directory = new File("C:\\rocket\\teste");
        System.out.println("Diretório existe? " + directory.exists());
        if (!directory.exists()) {
            directory.mkdirs();
            System.out.println("Diretório criado");
        }
        try {
            File file = new File(directory, "aula-java.txt");
            file.createNewFile();
            System.out.println("Arquivo criado");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
