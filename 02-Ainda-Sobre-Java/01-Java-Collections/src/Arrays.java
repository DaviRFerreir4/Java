public class Arrays {
    public static void main(String[] args) {
        Integer[] array = {2, 4, 10, 15, 5, 3};

        array[2] = 33;

        System.out.println(array[3]);

        for (int i = 0; i < array.length; i++) {
            Integer number = array[i];
            System.out.print(number + " ");
        }
    }
}
