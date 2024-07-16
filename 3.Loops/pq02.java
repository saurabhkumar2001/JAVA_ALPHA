//factorial
import java.util.*;
public class pq02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    long fact = 1;
    for (int i = 1; i <num; i++) {
        fact = fact*i;
    }
System.out.println("the factorial of "+num+" is: "+fact);
}

    
}