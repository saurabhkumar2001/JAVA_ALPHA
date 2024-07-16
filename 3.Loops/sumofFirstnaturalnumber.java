import java.util.*;
public class sumofFirstnaturalnumber {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number where you want to find the sum : ");
        int num = sc.nextInt();
        int i = 0;
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.print( "the sum of number from 0 to " +num +" is : "+sum);
    }
}
