import java.util.Scanner;

public class pairsinarray {
    public static void makingpairs(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
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
    makingpairs(arr);
 }   
}
