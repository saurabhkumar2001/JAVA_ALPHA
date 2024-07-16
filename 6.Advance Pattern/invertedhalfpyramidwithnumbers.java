import java.util.*;
public class invertedhalfpyramidwithnumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=row; i++) {
            for (int j = 0; j <=row-i; j++){
                System.out.print((j+1));
            }
            System.out.println();
        }
    }
}
