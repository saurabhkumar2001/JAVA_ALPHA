import java.util.*;
public class Reverseofnumber1 {
    public static void main(String[] args){
    System.out.println("Enter a 5 digit number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        int rev = 0;
    for (int i = 0; i < 5; i++) {
        int newdig =num%10;
        num = num/10;
        rev = (rev*10)+newdig;
    }
    System.out.println("the reversed number is: "+rev);
    }

}
