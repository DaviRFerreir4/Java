/**
 * Representa uma classe de Aluno
 * */
public class JavaBeans {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("O valor da idade deve ser maior que 0");
        }
        this.age = age;
    }
}