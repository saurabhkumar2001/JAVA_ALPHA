
public class sumOfFirstN {
    // this is called funnctional way
    // public static int sum(int n) {
    //     if (n == 0) {
    //         return n;
    //     }
    //     return n + sum(n - 1);
    // }

    // this is called funnctional way
    public static int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void sum(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        } else {
            sum(n - 1, s += n);
        }

    }

    public static void main(String[] args) {
        sum(5, 0);
    }
}
