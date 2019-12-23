
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int untilFirstNumber;
        int untilSecondNumber;
        int sumNumber = 0;
        int startNumber = 1;

        System.out.println("First: ");
        untilFirstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        untilSecondNumber = Integer.parseInt(reader.nextLine());

        startNumber = untilFirstNumber;
        while(startNumber <= untilSecondNumber){
            sumNumber+=startNumber;
            startNumber++;
        }
        System.out.println("Sum is " + sumNumber);
    }
}
