
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Ask for user
        System.out.println("Type your username: ");
        String userName = reader.nextLine();
        // Ask for password
        System.out.println("Type your password: ");
        String passWord = reader.nextLine();

        // Validation
        if(userName.equals("alex") && passWord.equals("mightyducks") ||
                userName.equals("emily") && passWord.equals("cat")){
                    System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
