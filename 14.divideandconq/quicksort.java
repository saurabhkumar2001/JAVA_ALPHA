public class quicksort {
    public static void quick(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }
        int p = partition(arr, start, end);
        quick(arr, start, p - 1);
        quick(arr, p + 1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5, 90 };
        int start = 0;
        int end = arr.length - 1;
        quick(arr, start, end);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}