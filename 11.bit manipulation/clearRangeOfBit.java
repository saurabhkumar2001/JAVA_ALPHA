import java.util.*;

public class clearRangeOfBit {
    public static void rangeClear(int n ,int s ,int e){
        int a = (~0)<<(e+1); //1111000000000000000
        int b = (1<<s)-1;   //00000000000000000011
        int val = n&(a|b);
        System.out.println(dectobin(val));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(dectobin(n));
        System.out.println("enter the starting index for clear : ");
        int s = sc.nextInt();
        System.out.println("enter the ending index for clear : ");
        int e = sc.nextInt();
        rangeClear(n,s,e);
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