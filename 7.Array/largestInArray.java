import java.util.*;

public class largestInArray {
    public static void largest(int array[]) {

        int largenumber = array[0];
        for (int j = 0; j < array.length; j++) {
            {
                if (largenumber<array[j]) {
                    largenumber = array[j];
                }
            }
        }
        System.out.println("The largest number in the array is: "+largenumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element expected");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest(arr);
    }
}
