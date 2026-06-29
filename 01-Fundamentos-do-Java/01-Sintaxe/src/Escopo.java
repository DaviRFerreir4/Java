// Acount
public class Escopo {
    double balance;

    public void withdraw(double amount) {
        double newBalance = balance - amount;
    }

    public void checkBalance() {
        // Funciona pois está no escopo global
        System.out.println(balance);
        // Não funciona pois está no escopo da função "withdraw"
        // System.out.println(newBalance);
    }
}
