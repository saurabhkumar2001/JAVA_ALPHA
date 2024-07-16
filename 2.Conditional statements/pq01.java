// Write a Java program to get a number from the user and print whether it is
// positive or negative.


import java.util.*;
public class pq01{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the  number : ");
    int n = sc.nextInt();
    if (n>=0) {
        System.out.println("no is Positive");
    }
    else {
        System.out.println("no is negative");
    }

}    
}