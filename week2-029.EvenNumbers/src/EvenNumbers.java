
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int number = 0;
        while(number <= 100){
            number++;
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
