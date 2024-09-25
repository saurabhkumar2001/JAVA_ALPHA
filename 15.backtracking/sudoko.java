public class sudoko {
    public static boolean isSafe(int[][] sudoko, int row, int col, int digit) {
        // column traverse

        for (int i = 0; i < sudoko.length; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }
        // row traverse
        for (int i = 0; i < sudoko.length; i++) {
            if (sudoko[row][i] == digit) {
                return false;
            }
        }

        // grid traverse
        int strow = (row / 3) * 3;
        int stcol = (col / 3) * 3;
        for (int i = strow; i < strow + 3; i++) {
            for (int j = stcol; j < stcol + 3; j++) {
                if (sudoko[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokosolver(int[][] sudoko, int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // recursion
        int nextrow = row;
        int nextcol = col + 1;
        if (nextcol + 1 == 9) {
            nextrow++;
            nextcol = 0;
        }
        if (sudoko[row][col] != 0) {
            return sudokosolver(sudoko, nextrow, nextcol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(sudoko, row, col, i)) {
                sudoko[row][col] = i;
                if (sudokosolver(sudoko, nextrow, nextcol)) {
                    return true;
                }
                sudoko[row][col] = 0;
            }

        }

        return false;
    }

    public static void printsudoko(int[][] sudoko) {
        for (int i = 0; i < sudoko.length; i++) {
            for (int j = 0; j < sudoko.length; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (sudokosolver(sudoko, 0, 0)) {
            System.out.println("Solution exists");
            printsudoko(sudoko);
        }else{
            System.out.println("solution does not exist");
        }
    }
}