public class ExpressoesSimples {
    public static void main(String[] args) {
        String name = "Davi";
        Integer id = 5257181;
        Double salary = 1500.0;

        String employeeData = String.format("Mat.: %d | Name: %s | Sal.: %,.2f",
                id, name, salary);
        System.out.println(employeeData);
    }
}
