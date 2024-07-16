import java.util.*;
public class reverseArrayoptimized {
    public static void reverse(int arr[]){
        int start = 0, last = arr.length-1;
        while (last>start) {
            int temp = arr[last];
            arr[last]=arr[start];
            arr[start]=temp;
            start++;
            last--;
        }
        System.out.print("\nREVERSEArray :  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the len of arr");
        int len = sc.nextInt();
        int arr[]= new int[len];
        System.out.println("enter the Element of arr");
        for (int i = 0; i <len; i++) {
            arr[i]=sc.nextInt();}
            System.out.print("Array :  ");
        for (int i = 0; i <len; i++) {
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
    }
}
