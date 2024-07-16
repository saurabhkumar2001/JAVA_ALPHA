import java.util.Arrays;

import javax.swing.border.StrokeBorder;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            // convert string into character array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println("Strings are anagrams of each other");
            }else System.out.println("Strings are not anagrams of each other");

        }else System.out.println("Strings are not anagrams of each other");
    }

}
