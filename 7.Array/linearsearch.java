import java.util.*;
public class linearsearch {
    public static void linearsearch(int array[],int key){
        for (int j = 0; j < array.length; j++) {
        if (array[j]==key) {
            System.out.println("found at index "+j);
            }
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of element expected");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
    }  
    System.out.print("Enter the key you want to findout: ");
    int key = sc.nextInt();
    linearsearch(arr,key);     
    }
}
