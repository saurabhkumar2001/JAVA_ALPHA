import java.util.*;
public class Arraybasic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);   
        int n;
        System.out.println("How many subject are there? "); 
        n = sc.nextInt();
        //creation of the array 
        int marks[] = new int[n];
        //input in the array
        for (int i = 0; i < marks.length; i++){
            System.out.println("Enter the marks of subject "+(i+1)); 
            marks[i]=sc.nextInt();
        }
        //output from the array 
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+" "); 
        }
    }

    
}