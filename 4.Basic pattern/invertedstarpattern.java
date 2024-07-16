import java.util.*;

public class invertedstarpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - (i+1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}