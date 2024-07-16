import java.util.Arrays;

public class maxsubarrays {
    // order of n^3
    public static void bruteforce(int arr[]) {
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int cs = 0;
                for (int x = i; x <= j; x++) {
                    cs += arr[x];
                }
                if (ms < cs) {
                    ms = cs;
                }
            }
        }
        System.out.println(ms);
    }
// order of n^2
    public static void prefix(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                cs = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (ms < cs) {
                    ms = cs;
                }
            }
        }
        System.out.print(ms);
        System.out.println();
    }
// order of n^1
    public static void kadaneAlgo(int arr[]) {
      int cs =0;
      int ms = 0;
      for (int i = 0; i < arr.length; i++) {
        cs = cs+arr[i];
        if (cs<0) {
            cs = 0;
        }
        ms = Math.max(ms, cs);
    }
    System.out.print(ms);
    System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        bruteforce(arr);
        prefix(arr);
        kadaneAlgo(arr);

    }
}
