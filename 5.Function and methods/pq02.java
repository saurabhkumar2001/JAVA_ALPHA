/*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.*/
import java.util.*;
public class pq02 {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else return false;
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number: ");
   int num = sc.nextInt();
   boolean ch = isEven(num); 
System.out.println("isEven: "+ch);
}

}
