
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while(true){
            System.out.println("Type a temperature: ");
            double tempValue = Double.parseDouble(reader.nextLine());
            if(tempValue > -30 && tempValue < 40){
                Graph.addNumber(tempValue);
            }
        }
    }
}
