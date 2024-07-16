public class countingsort {
    public static void counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // frequency array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // value k block p jake coount ko bdha rha h
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
             while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
             }
        }
       printarr(arr);
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,3,1,2,4};
        counting_sort(arr);
    }
}
