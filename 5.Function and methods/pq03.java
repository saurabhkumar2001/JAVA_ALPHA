// Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)

import java.util.*;
//123
public class pq03 {
    public static void palindrome(int num) {
        int no = num;
        int sum = 0;
        while (num > 0) {
            int n = num % 10;
            sum = sum*10+n;
            num=num/10;
            }
             if (no == sum) {
            System.out.println("The number is palindrome");
        } else
            System.out.println("the number is not palindrome");
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        palindrome(num);
       
}
}