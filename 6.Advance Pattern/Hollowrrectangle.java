import java.util.*;
public class Hollowrrectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total row: ");
        int totrow = sc.nextInt();
        System.out.println("Enter the total column: ");
        int totcol = sc.nextInt();
        for (int i = 1 ; i <= totrow;i++){
            for(int j = 1 ;j<=totcol;j++){
                if(i==1 || i == totrow||j==1||j==totcol){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}