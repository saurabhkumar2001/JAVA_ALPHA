//to find transpose of the matrix !
public class pq03{

    public static void transpose(int arr[][]){
        System.out.println("TRANSPOSE");
        int row = 2;
        int col = 3;
        int[][] matrix= new int[col][row];
        for (int i = 0; i<row; i++){
            for (int j = 0; j <col; j++) {
                matrix[j][i]=arr[i][j];
            }
        }
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    int arr[][]={{1,2,3},{4,5,6}};
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0;j < arr[0].length; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    transpose(arr);
    
    }
}

