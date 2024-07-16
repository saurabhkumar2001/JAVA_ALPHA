import java.util.*;
public class swapvalue{
    public static void swap(int a , int b){
        int temp ;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is : "+a);
        System.out.println("The value of b is : "+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        swap(a, b);
    }
}