public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];

        for (int counter = 0; counter < array.length; counter++){
            newArray[counter] = array[counter];
        }
        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];

        int secondCounter = 0;
        for (int counter = array.length - 1; counter > -1; counter--){
            newArray[secondCounter] = array[counter];
            secondCounter++;
        }
        return newArray;
    }
}