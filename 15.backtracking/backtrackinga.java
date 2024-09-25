import java.util.Arrays;

public class backtrackinga {

    public static void array(int arr[],int i,int value){
        if (i==arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = value;
        array(arr, i+1, value+1);
        arr[i] = arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        int value = 1;
       array(arr,0, value);
       System.out.println(Arrays.toString(arr));
     return;
    }
}
