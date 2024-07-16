//keep enterning number till user dont enter a multiple of 3
import java.util.*;
public class breakstatement {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%10==0){
            break;
        }
        else
        System.out.println("your number is "+num);
    }
}

}