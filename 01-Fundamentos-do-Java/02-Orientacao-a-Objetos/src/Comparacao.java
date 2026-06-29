import java.util.Objects;

public class Comparacao {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        Integer i3 = Integer.parseInt("10");
        Integer i4 =  128;
        Integer i5 = Integer.parseInt("128");

        // stack vs heap.
        // Quando o numero é menor que 127 ele é mantido no stack, quando maior ele é mandado para o heap
        // e se torna um objeto, e a comparação de == de objetos gera false
        // System.out.println(i4 == i5);
        // System.out.println(i4.equals(i5));

        // String s1 = "Davi";
        // String s2 = "Davi";
        // String s3 = new String("davi");

        // System.out.println(s1 == s3);
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equalsIgnoreCase(s3));

        Car c1 = new Car("red", "hb20", "hyundai");
        Car c2 = new Car("red", "hb20", "hyundai");
        Car c3 = c1;
        Car c4 = new Car("blue", "hb20", "hyundai");

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c3);
        System.out.println(c1.equals(c4));
    }
}

class Car {
    String color, model, brand;

    public Car(String color, String model, String brand) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, brand);
    }
}