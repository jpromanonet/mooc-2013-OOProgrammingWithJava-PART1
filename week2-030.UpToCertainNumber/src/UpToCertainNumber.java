
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        int numberSince = 1;
        while(numberSince <= number){
            System.out.println(numberSince);
            numberSince++;
        }
    }
}
