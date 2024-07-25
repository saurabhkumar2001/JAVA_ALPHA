public class rotatedsortedarraysearch {
    public static int search(int arr[], int si, int ei, int target) {
        int mid = (si + ei) / 2;
        if (si > ei) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        // l1
        if (arr[si] <= arr[mid]) {
            // left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, si, mid - 1, target);
            } //right 
            else {
                return search(arr, mid + 1, ei, target);
            }
        }
        // l2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, mid + 1, ei, target);
            } else {
                return search(arr, si, mid - 1, target);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int si = 0;
        int ei = arr.length - 1;
        int idx = search(arr, si, ei, target);
        System.out.println(idx);
    }
}
