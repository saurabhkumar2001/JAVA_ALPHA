import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isprime = true;
        if (num == 2) {
            System.out.println("no is prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i== 0) {
                    isprime = false;
                }
            }
            if (isprime==true) {
                System.out.println("the given no is prime");
            }
            else
            System.out.println("The given number is not prime");
        }
    }

}

