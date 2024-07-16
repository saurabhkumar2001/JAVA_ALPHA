public class binarysearch {
    public static int binary(int arr[],int key) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while (start<=end) {
            if ( mid==key) {
                return mid;
            }
            else if (mid>key) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={34,45,64,65,76,78,98,99,100};
        int key = 64;
        System.out.println("my element found on the index"+binary(arr,key));
    }
}
