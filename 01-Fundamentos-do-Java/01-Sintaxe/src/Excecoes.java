import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public void AboutMe() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String name = "";
        String surname = "";
        int age = 0;
        double height = 0.0;

        do {
            try {
                System.out.print("Digite seu nome: ");
                name = scanner.next().trim();
            } catch (Exception ex) {
                System.out.println(ex.getClass());
                System.out.println("Erro inesperado");
                scanner.nextLine();
            }
        } while (name.isEmpty());
        do {
            try {
                System.out.print("Digite seu sobrenome: ");
                surname = scanner.next().trim();
            } catch (Exception ex) {
                System.out.println(ex.getClass());
                System.out.println("Erro inesperado");
                scanner.nextLine();
            }
        } while (surname.isEmpty());
        do {
            try {
                System.out.print("Digite sua idade: ");
                age = scanner.nextInt();

                if (age <= 0) {
                    age = 0;
                    throw new IllegalArgumentException("A idade deve ser superior a 0");
                }
            } catch (InputMismatchException err) {
                String msg = err.getMessage();
                System.out.println(msg != null ? msg : "Valor digitado é inválido");
                scanner.nextLine();
            } catch (Exception ex) {
                System.out.println(ex.getClass());
                System.out.println("Erro inesperado");
                scanner.nextLine();
            }
        } while (age == 0);
        do {
            try {
                System.out.print("Digite sua altura: ");
                height = scanner.nextDouble();
                if (height <= 0.30) {
                    throw new IllegalArgumentException("A altura deve ser superior a 30 centimetros");
                }
            } catch (IllegalArgumentException ex) {
                String msg = ex.getMessage();
                System.out.println(msg);
            } catch (InputMismatchException ex) {
                System.out.println("Valor digitado é inválido");
                scanner.nextLine();
            } catch (Exception ex) {
                System.out.println(ex.getClass());
                System.out.println("Erro inesperado");
                scanner.nextLine();
            }
        } while (height == 0.0);

        System.out.println("Olá, me chamo " + name + " " + surname);
        System.out.println("Tenho " + age + " anos");
        System.out.println("Minha altura é " + height + " cm");

        scanner.close();
    }
}
