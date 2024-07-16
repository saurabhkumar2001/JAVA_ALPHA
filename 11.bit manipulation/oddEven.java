import java.util.*;
public class oddEven{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number : ");
int n = sc.nextInt();
int binary = 0;
int pow = 0;
while (n>0) {
    int val = n%2;
    binary += val*(int)Math.pow(10,pow);
    n/=2;
    pow++;
}
// System.out.println(binary);
    if (binary%2==0) {
        System.out.println("Even");
    }else
    System.out.println("Odd");
}
}
