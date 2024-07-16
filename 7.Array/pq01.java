import java.util.*;
public class pq01 {
    public static void duplicate(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    
                    System.out.print("\nduplicate element is "+arr[i]);
                }
            }
            
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        duplicate(arr);
    }
}
