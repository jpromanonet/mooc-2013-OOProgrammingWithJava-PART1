
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double numberOne = Integer.parseInt(reader.nextLine());
        System.out.println(("Type another number: "));
        double numberTwo = Integer.parseInt(reader.nextLine());

        double division = numberOne / numberTwo;
        System.out.println("Division: "+numberOne+ " / "+numberTwo+" = "+division);
    }
}
