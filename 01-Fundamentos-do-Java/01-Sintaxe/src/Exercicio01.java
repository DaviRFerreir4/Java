import java.time.LocalDate;

// Conta
public class Exercicio01 {
    String accountNumber;
    String agencyNumber;
    String clientName;
    LocalDate birthDay;
    Double accountAmount;
    Boolean active = true;

    public double withdraw(Double amount) {
        accountAmount -= amount;

        return amount;
    }

    public double transfer(String accountNumber, Double amount) {
        accountAmount -= amount;

        return amount;
    }

    public void cancelAccount(String reason) {
        active = false;
    }

    public double consultPreviousAmount(String date1, String date2) {
        Double accountPrevAmount = 0.0;

        return accountPrevAmount;
    }

    public double consultAmount() { return accountAmount; }
}
