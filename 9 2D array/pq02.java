import java.util.Scanner;

public class pq02 {
    public static void printsum(int arr[][],int row){
        int sum = 0;   
        for (int j = 0; j < arr[row].length; j++) {
                sum+=arr[row][j];
            }
        System.out.println("sum of row "+row+" is: "+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("Enter row you want to find sum :");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        printsum(arr,row);
    }
}
