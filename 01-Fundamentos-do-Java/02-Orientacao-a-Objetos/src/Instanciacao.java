/**
 * Cliente
 * */
public class Instanciacao {
    private String name;
    private Double limit = 10.0;

    public Instanciacao(String name) {
        this.name = name;
    }

    public void requestLimit(Double requestedLimit) {
        this.limit = requestedLimit;
    }

    public void buy(Double valueBought) {
        limit -= valueBought;
    }

    public String getName() {
        return name;
    }

    public Double getLimit() {
        return limit;
    }
}
