import java.util.*;
public class getbit {
    public static int getbitith(int n,int i){
    int bitMask = 1<<i;
    if ((n&bitMask)==0) {
        return 0;
    }else
    return 1;
    }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    System.out.println("enter the ith position where you want to check the value: ");
    int ith = sc.nextInt();
    int val = getbitith(num,ith);
    System.out.println(val);
 }   
}
