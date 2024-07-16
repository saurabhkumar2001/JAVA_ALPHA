import java.util.Scanner;
//CLASSICAL PROBLEM NO 1: 
public class maxSubArraySum {
    public static int subarray(int arr[]) {
        int sum = 0;
        int maxsum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                System.out.print(sum + " ");
                if (maxsum < sum) {
                    maxsum = sum;
                }

            }

        }

        return maxsum;
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
       int max =  subarray(arr);
       System.out.println("\nThe maximum sum of the sub array is : "+max);
    }
}
