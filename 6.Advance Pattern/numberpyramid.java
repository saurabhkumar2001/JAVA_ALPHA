import java.util.*;
public class numberpyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the line: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <(n-1)-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print((i+1)+" ");
            }
         System.out.println();
        }
    }
}