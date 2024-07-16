//multiplication table 
import java.util.*;
public class pq03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int mul;
    for (int i = 1; i <=10; i++) {
        mul = num*i;
        System.out.println(num+" X "+i+" = "+mul);
    }
}

    
}