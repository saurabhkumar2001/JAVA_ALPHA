import java.util.*;
public class maxsubarraysum2 {
public static int maxsubarraysum(int arr[]){ 
    int prefix[] = new int[arr.length];
    int max = Integer.MIN_VALUE;
    int sum = 0;
    prefix[0]=arr[0];
    //calculate prefix array 
    for (int i = 1; i < prefix.length; i++) {
        prefix[i]=prefix[i-1]+arr[i];
    } 
    //to show the sum of prefix array 
    for (int i = 0; i < prefix.length; i++) {
        System.out.print(prefix[i]+" ");
    }
    System.out.println();
            // main logic 
            /* if mera i = 0  value h toh mera start ki value bhi zero and end ki bhi value zero ho jayegi isliye humne start m ek ternary operator lgaya h jisse agar start and end zero ho toh start minus one ho kyuki nhi toh iska mtlb hoga -1 but indexing kbhi bhi -1 nhi hota h   */

    for (int i = 0; i < arr.length; i++) {
        int start = i;
        for (int j = i; j < arr.length; j++) {
            int end = j;
            sum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
            if(max<sum){
                max=sum;
        }
    }
    }
    return max;
            //main func
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
    int max = maxsubarraysum(arr);
    System.out.println("the maximum sum of sub array is : "+max);
}    
}

