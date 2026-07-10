public class Register {
    private Integer rowid;
    private String name;
    private String birthdate;

    public Register(String name, String birthdate, Integer rowid) {
        this.name = name;
        this.birthdate = birthdate;
        this.rowid = rowid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }
}
