import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform :");
        String opr = sc.next();
        switch (opr) {
            case "+":
                System.out.print("the addition of two number: ");
                System.out.println(a+b);
                break;
                case "-":
                System.out.print("the subtraction of two number: ");
                System.out.println(a-b);
                break;
                case "*":
                System.out.print("the multiplication of two number: ");
                System.out.println(a*b);
                break;
                case "/":
                System.out.print("the division of two number: ");
                System.out.println(a/b);
                break;
                case "%":
                System.out.print("the modulo of two number: ");
                System.out.println(a%b);
                break;
        
            default:
                break;
        }
        
    }
}