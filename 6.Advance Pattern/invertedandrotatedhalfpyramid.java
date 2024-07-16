import java.util.Scanner;

public class invertedandrotatedhalfpyramid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total row: ");
        int totrow = sc.nextInt();
        for (int i = 0; i < totrow; i++) {
            for (int j = 0; j < (totrow-i)-1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
