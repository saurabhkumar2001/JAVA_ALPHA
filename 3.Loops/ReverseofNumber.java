import java.util.*;
public class ReverseofNumber {
    public static void main(String[] args){
    System.out.println("Enter a 5 digit number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 0; i < 5; i++) {
        int dig =num%10;
        num = num/10;
        System.out.print(dig);
    }
    }

}


