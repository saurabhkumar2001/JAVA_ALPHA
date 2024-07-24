import java.util.ArrayList;

public class occurance {
    public static void occurance1(int arr[],int i,int key) {
        if(i==arr.length){
            return;
        }
        if(key == arr[i]){
        System.out.print(i+" ");
        }
        occurance1(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        occurance1(arr, 0, 2);
    }
}
