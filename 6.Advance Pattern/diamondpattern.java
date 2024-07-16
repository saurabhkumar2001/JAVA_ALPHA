import java.util.*;
public class diamondpattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the line: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <(n-1)-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >0; i--) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}