public class spiralmatrix{
    //in 2d matirx matrix[i][j] i is row and j is col so if we want to print only row then we have to make column as constant and if we want to print column then we have to make row as constant 
    public static void printspiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while (startRow<=endRow && startCol<=endCol) {  //we have written <= symbol because if dont use this symbol then some of the index got left 
            //top
            for (int j= startCol; j <=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for (int j=endCol-1; j >=startCol; j--) {
                if (startRow == endRow) {
                break;
            }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for (int i=endRow-1; i >=startRow+1; i--) {
                     if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};
                printspiral(arr);
    }
}