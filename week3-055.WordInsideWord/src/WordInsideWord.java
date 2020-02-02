import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String word1 = reader.nextLine();
        System.out.print("Type the second word: ");
        String word2 = reader.nextLine();

        isWordHere(word1, word2);
    }


    public static void isWordHere(String word1, String word2) {
        //old code: String partWord = word.substring(length);
        int index = word1.indexOf(word2);
        if (index == -1) {
            System.out.println("The word " + word2 + " is not found in the word " + word1);
        } else {
            System.out.println("The word " + word2 + " is found in the word " + word1);
        }
    }
}