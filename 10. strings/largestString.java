import java.util.*;
public class largestString {
    public static void largeststring(String str[]){
        String large = str[0];
        for (int i = 1; i < str.length; i++) {
            if(large.compareToIgnoreCase(str[i])<0){ //-1 tb aayega jb hamara string bda hoga large se 
                large = str[i];
            }
        }
        System.out.println("The largest string in the string array is :"+large);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of string you want to print: ");
        int n = sc.nextInt();
        String[] str = new String[n]; 
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        largeststring(str);
    }
}
