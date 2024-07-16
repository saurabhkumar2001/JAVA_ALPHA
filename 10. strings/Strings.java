import java.util.*;
public class Strings{
    //strings are immutable no changes 
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "saurabh";  
        String str1 = new String("saurabh");
        Scanner sc = new Scanner(System.in);
        String Name,gender;
        Name = sc.nextLine(); //it gives full line
        System.out.println(Name);
        gender= sc.next(); //it gives only one word
        System.out.println(gender);
    }
}