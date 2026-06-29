/**
 * Enum representando estados brasileiros
 * Enums são classes especiais onde todos objetos dela são criados previamente e são imutaveis e disponiveis na aplicação
 * */
public enum Enums {
    SP("Sao Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ"),
    RS("Rio Grande do Sul", "RS"),
    PR("Parana", "PR"),
    BA("Bahia", "BA"),
    CE("Ceara", "CE"),
    MT("Mato Grosso", "MT"),
    GO("Goias", "GO"),
    AM("Amazonas", "AM"),
    AC("Acre", "AC");

    private String name;
    private String acronym;

    private Enums(String name, String acronym) {
        this.name = name;
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public String getAcronym() {
        return acronym;
    }
}
