import java.util.Scanner;

public class clear_ith_bot {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println(dectobin(n));
    System.out.println("ith place from the last: ");
    int i = sc.nextInt();
    int bitmask = ~0<<i;
    int val = bitmask&n;
    System.out.println(dectobin(val));

    }

    public static int dectobin(int value) {
        int binary = 0;
        int pow = 0;
        while (value > 0) {
            int val = value % 2;
            binary += val * (int) Math.pow(10, pow);
            pow++;
            value /= 2;
        }
        return binary;
    }

}