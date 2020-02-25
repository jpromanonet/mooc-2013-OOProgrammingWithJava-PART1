public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // separate with comma and whitespace, no comma trailing at end of last number.

        for (int count = 0; count < array.length; count++) {

            System.out.print(array[count]);

            if (count == array.length-1) {
                // do nothing at end
            } else {
                System.out.print(", ");
            }
        }

    }
}