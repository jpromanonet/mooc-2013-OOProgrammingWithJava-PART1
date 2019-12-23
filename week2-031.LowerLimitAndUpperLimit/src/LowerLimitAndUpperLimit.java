
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int firstNumber;
        int secondNumber;

        System.out.println("First: ");
        firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        secondNumber = Integer.parseInt(reader.nextLine());

        int nowNumber;
        nowNumber = firstNumber;
        while(nowNumber <= secondNumber){
            System.out.println(nowNumber);
            nowNumber++;
        }
    }
}
