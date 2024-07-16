import java.util.*;
public class prime {
    public static boolean primenumber(int num) {
        boolean isprime = true;
        for (int i = 2; i <num; i++) {
                if(num%i==0){
                    isprime = false;
                    break;
                }
        }
        return isprime;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    System.out.println("isprime or not (true/false): "+primenumber(num));
}    
}
