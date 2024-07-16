public class diagonalsum {
    // diagonal sum is also a classical problem but it is asked when n = m means row
    // and column is equal or more logically when we start from the top left and
    // goes to right bottom and vice versa
    public static void printdiagonalsum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                if(i==j){
                    sum+=arr[i][j];
                }
                else if (i+j == arr.length-1) {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("total sum of diagonal is = "+sum);

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12},
                        { 13, 14, 15, 16 } };
        printdiagonalsum(arr);
    }
}
