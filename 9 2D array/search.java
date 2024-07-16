// search in sorted matrix--->
public class search {
    public static void searchsortedmatrix(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                        System.out.println(key+" found at --> ("+(i+1)+","+(j+1)+")");
                }
            }

        }
    }

    // public static void searchbinarysortmatrix(int arr[][],int key ){
    //     for (int i = 0; i < arr.length; i++) {
    //         int start = 0;
    //         int end = arr.length-1;
    //         int mid = (start +end )/2;
    //         while (start<=end) {
    //             if (key == arr[i][mid]) {
    //                 System.out.println("found");
    //             }
    //             else if (key > arr[i][mid]) {
    //                 start = arr[i][mid+1];
    //             }
    //             else{
    //                 end = arr[i][mid-1];
    //             }
                
    //         }
    //     }
    // }

    public static void staircasesearch(int arr[][],int key ){
       int row = 0 , col = arr[0].length-1;
       while (row < arr.length && col >= 0) {
                if (arr[row][col] == key) {
                      System.out.println(key+" found at --> "+row+","+col);
                }
                else if(key < arr[row][col])
                {
                    col--;
                }
                else{
                    row++;
                }
            }
       }
    

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int key = 15;
        // searchsortedmatrix(arr, key);
        // searchbinarysortmatrix(arr, key);
        staircasesearch(arr,key);
    }
}