public class CountSetBits {

    public static void main(String[] args) {
        int n = 350;
        System.out.print(dectobin(n));
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("\nTotal set bits are: " + count);
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