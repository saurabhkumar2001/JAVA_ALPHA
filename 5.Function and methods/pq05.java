import java.util.*;
public class pq05 {
    public static void sumofnumber(int n){
        int sum = 0;
        while (n>0) {
        int num = n%10;
            sum = sum+num;
            n = n/10;
        }
        System.out.println("the sum of the number "+sum);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    sumofnumber(n);

    }
}
