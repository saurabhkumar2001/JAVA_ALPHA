import java.util.*;

public class update {
    public static int update_val(int value, int ith, int i) {
        int bitmask = (i << ith);
        return value | bitmask;
    }

    public static int clearithbits(int val, int ith) {
        int bitmask = ~(1 << ith);
        int num = val & bitmask;
        return num;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int val = sc.nextInt();
        System.out.println(dectobin(val));
        System.out.println("enter the bit where the val should be clear");
        int ith = sc.nextInt();
        int value = clearithbits(val, ith);
        System.out.print("Enter the bit you want to add: ");
        int i = sc.nextInt();
        int num = update_val(value, ith, i);
        System.out.println(dectobin(num));
    }
}