
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Ask the user for the number to power.
        System.out.println("Type a number: ");
        int numberToPower = Integer.parseInt(reader.nextLine());

        // Logic procedure
        int sum = 0;
        int i = 0;

        // Loop until finish
        while(i <= numberToPower){
            int math = (int)Math.pow(2, i);
            sum += math;
            i++;
        }

        // Output
        System.out.println("The result is " + sum);
    }
}
