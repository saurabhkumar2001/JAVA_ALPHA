public class insertionsort {
    public static void insertionsort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i-1;
            /*here we are finding the correct position to insert*/
            while(previous>=0 && arr[previous]>current) { 
                arr[previous+1]=arr[previous]; 
                previous--;                     
            }
            arr[previous+1]= current;               
            }
            printarr(arr);
        }
    
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3,54,65,3423,65,443,256,6,4,32,-433,0};
        insertionsort(arr);
    }
}

