import java.text.NumberFormat;

public class Excecoes {
    public static void main(String[] args) {
        try {
            checkState("PI");
            checkState("FL");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Inform a valid state");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Inform a state from Brazil");
        }

        // como o método retorna uma runtime exception, não precisa ser
        // tratado antes de rodar, mas ele ainda vai parar a execução do código
        // Double value = Double.valueOf("a1");

        try {
            // como o método retorna uma exception, precisa ser tratado antes
            //  de rodar
            Number value2 = NumberFormat.getCurrencyInstance().parse("asd");
        } catch (Exception ex) {
            System.out.println("Erro");
            ex.printStackTrace();

        } finally {
            System.out.println("Executado independente do resultado");
        }
    }

    private static void checkState(String state) throws StateValidationException, Exception {
        if (state.equals("FL")) {
            throw new Exception("Not from Brazil");
        } else if (state.equals(
                "SP")) {
            throw new StateValidationException();
        } else {
            System.out.println("Valid State");
        }
    }
}

class StateValidationException extends RuntimeException {
    public StateValidationException() {
        super("The state wasn't located");
    }
}