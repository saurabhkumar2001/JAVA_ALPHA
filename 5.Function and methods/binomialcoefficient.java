import java.util.*;
public class binomialcoefficient {
    public static int fact(int num) {
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact=fact*i;
        }
        return fact;
    }

   public static int ncr(int n, int r){
    int a = fact(n);
    int b = fact(r);
    int c = fact(n-r);
    return a/(b*c);
   }     
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n of your equation: ");
    int n = sc.nextInt();
    System.out.println("enter the r of your equation: ");
    int r = sc.nextInt();
    System.out.println("the binomial coefficient is : "+ncr(n,r));
}
}
