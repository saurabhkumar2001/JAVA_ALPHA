import java.util.*;

public class setithbit {
    public static int setithbits(int val, int ith) {
        int bitmask = 1<<ith;
        int num = val|bitmask;
        return num;

    }
    public static void dectobin(int value){
        int binary = 0;
        int pow = 0;
        while (value>0) {
            int val = value%2;
            binary+=val*(int)Math.pow(10,pow);
            pow++;
            value/=2;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int val = sc.nextInt();
        System.out.println("enter the bit where the val should be set");
        int ith = sc.nextInt();
        int value = setithbits(val, ith);
        dectobin(value);
    }
}