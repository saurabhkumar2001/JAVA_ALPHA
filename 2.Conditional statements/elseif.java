import java.util.*;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>13 && age<18) {
            System.out.println("Teenager|not eligible to vote");
        }
        else if(age>18) {
            System.out.println("Eligible to vote|elder");
        } else {
            System.out.println("child");
        }
    }
}
