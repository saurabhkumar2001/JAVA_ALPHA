import java.util.*;
public class oddeveneasy {
    public static void oddEven(int n){
        int bits = 1;
        if ((n&bits)==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        oddEven(num);
    }
}
