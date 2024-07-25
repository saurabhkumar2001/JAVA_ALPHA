public class mergesort {
    public static void divide(int arr[], int start, int end) {
        int mid = (start + end) / 2;
        if (start >= end) {
            return;
        }
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conqueror(arr, start, end, mid);
    }

    public static int[] conqueror(int[] arr, int start, int end, int mid) {
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k =0;
        while (i<=mid && j<=end) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j<=end) {
            temp[k++] = arr[j++];
        }

        for (int k2 = 0, k3 = start; k2 < temp.length; k2++,k3++) {
            arr[k3] = temp[k2];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5, 90 };
        int start = 0;
        int end = arr.length - 1;
        divide(arr, start, end);
        for (int i : arr) {
            System.err.print(i+" ");
        }
        
    }
}
