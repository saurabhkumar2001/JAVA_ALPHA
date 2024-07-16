// Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.

import java.util.*;
public class pq02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature in ferenhite: ");
        double temp = sc.nextDouble();
        if (temp >103.5) {
            System.out.println("High fever");
        }
    
        else if (temp >100 && temp <103.5 ) {
            System.out.println("moderate fever");
        }
    
        else{
            System.out.println("no Fever");
        }
    
    }
}
