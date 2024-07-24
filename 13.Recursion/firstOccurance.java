public class firstOccurance {
    public static boolean FO(int arr[],int key,int i){
        if (i==arr.length) {
            return false;
        }
        if(arr[i]==key){
            return true;
        }

        return FO(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {23,4,5,6,3,66,7,88,4};
        boolean var = FO(arr, 100, 0);
        if (var) {
            System.out.println("found");
        }else{

            System.out.println("not found");
        }
    }
}
