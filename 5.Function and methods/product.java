import java.util.*;
public class product {
  public static int mul(int a , int b){
    return a*b;
  }
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number 1");
      int a = sc.nextInt();
      System.out.println("Enter the number 2");
      int b = sc.nextInt();
      int pro = mul(a,b);
      System.out.println("the multiply of two number is : "+pro);

    }

}

