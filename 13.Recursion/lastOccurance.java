public class lastOccurance {
    public static int lo(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lo(arr, key, i+1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,3,6,223,4,2,45,32,1,4};
        System.out.println(lo(arr,4,0));
    }
}  