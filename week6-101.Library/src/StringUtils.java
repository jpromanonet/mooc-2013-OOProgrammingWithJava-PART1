import java.util.*;


public class StringUtils {    // 101.4 improved search


    public StringUtils() {    // constructor

    }

    public static boolean included(String word, String searched) {
        if (word == null || searched == null || word.isEmpty() || searched.isEmpty()) {
            return false;
        }

        word = word.trim();
        word = word.toUpperCase();
        searched = searched.trim();
        searched = searched.toUpperCase();

        if (word.contains(searched)) {
            return true;
        } else {
            return false;
        }
    }
}