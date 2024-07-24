public class checkarrayisSorted {
    public static boolean isSorted(int arr[],int i){
        if (i==arr.length-1) {   //base case
            return true;
        }if (arr[i]>arr[i++]) {   //condition to false
            return false;
        }
           return isSorted(arr, i++);   //recursive case
    
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean var = isSorted(arr, 0);
        if(var){
            System.out.println("Array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
