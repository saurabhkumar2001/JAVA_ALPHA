import java.util.*;
public class OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");   
        int no = sc.nextInt();
        if(no%2==0){
            System.out.println(no+" is even :)");; 
        }
        else{

            System.out.println(no+" is odd :)");
        }
        
    }
}
