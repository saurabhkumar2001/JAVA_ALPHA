import java.util.Scanner;

public class printsubarray {
    public static int subarray(int arr[]) {
        int counter=0;
            for (int i  = 0; i < arr.length; i++) {
                int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
            for (int k = start; k<=end; k++) {
                System.out.print(arr[k] + " ");
            }
            counter++;
            System.out.print("    ");
            }
            System.out.println();
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the Element of the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int n =subarray(arr);
        System.out.println("TOTAL SUBARRAY IS : "+n);
    }
}
