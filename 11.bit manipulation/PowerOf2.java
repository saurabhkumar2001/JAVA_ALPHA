import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        if ((n&(n-1))==0) {
            System.out.println("yes the number is power of 2");
        }else System.out.println("no the number is not power of 2");
    }
}
