
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int untilNumber;
        int sumNumber = 0;
        int startNumber = 1;

        System.out.println("Until what? ");
        untilNumber = Integer.parseInt(reader.nextLine());

        while(startNumber <= untilNumber){
            sumNumber+=startNumber;
            startNumber++;
        }
        System.out.println("Sum is " + sumNumber);
    }
}
