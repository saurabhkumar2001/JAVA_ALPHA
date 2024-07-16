import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Annual income");
        double income = sc.nextFloat();
        double tax = 0;
        if (income<500000) {
            tax = 0*income;
            income = income + tax;
                System.out.println("your income including tax is "+income);
                System.out.println("your tax is "+tax);

        }
        else if (income>500000 && income<1000000) {
            tax = 0.20*income;
            income = income + tax;
                System.out.println("your income including tax is "+income);
                System.out.println("your tax is "+tax);
        }
        else{
             tax = 0.30*income;
            income = income + tax;
                System.out.println("your income including tax is "+income);
                System.out.println("your tax is "+tax);
        }
        
    }
}