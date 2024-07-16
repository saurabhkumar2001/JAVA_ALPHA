import java.util.Scanner;

public class kadanesalgo{
    public static int kadanes(int arr[]){
       int currentsum = 0;
       int maxsum = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
            currentsum+=arr[i];
            if (currentsum<0) {
                currentsum = 0;
            }
            if (maxsum < currentsum) {
                maxsum = currentsum;
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
       int max =  kadanes(arr);
       System.out.println("\nThe maximum sum of the sub array is : "+max);
    }
}