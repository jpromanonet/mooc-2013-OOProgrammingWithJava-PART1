import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] array = {4, 5, 6, 7, 8, 9};
        Scanner reader = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedNumber = reader.nextLine();
        System.out.println();

        boolean isThere = BinarySearch.search(array, Integer.parseInt(searchedNumber));

        System.out.println(isThere);

    }
}