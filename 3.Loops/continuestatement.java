import java.util.*;
public class continuestatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter any number ");
            int num = sc.nextInt();
            if (num%10==0) {
                continue;
            }
            System.out.println("your number was : "+num);
        } while (true);
    }
}
