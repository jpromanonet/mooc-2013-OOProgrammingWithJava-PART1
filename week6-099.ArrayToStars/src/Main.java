public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {              // do we need "void" here? do we need "static" ?

        for (int number : array) {                             // each number of the array
            for (int counter = 0; counter < number; counter++) {     // counter counts to current number
                System.out.print("*");                         // print a number of stars equal to "number" variable
            }
            System.out.println("");
        }
    }
}