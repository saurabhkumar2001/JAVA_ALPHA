import java.util.Scanner;

public class reversearray {
    public static void reverse(int arr[]){
        int n = arr.length;
        int array[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            array[n-i-1]=arr[i]; 
        }
        System.out.println("Reverse array will be: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int len = sc.nextInt();
    int arr[]=new int[len];
    System.out.println("Enter the Element of the array: ");
    for (int i = 0; i < len; i++) {
    arr[i]=sc.nextInt();
    }
    reverse(arr);
 }   
}
