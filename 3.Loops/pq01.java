/*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers*/
import java.util.*;
public class pq01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < num; i++) {
            if (i%2==0) {
                evensum += i;
            }
            else{
                oddsum += i;
            }
        }
        System.out.println("sum of the even integer is : "+evensum);
        System.out.println("sum of the odd integer is : "+oddsum);
    }
}
