import java.util.*;
public class passingarraytothefunction {
    public static void arrayupdation(int marks[],int var){
        for (int i = 0; i < marks.length; i++) 
        {
                marks[i]+=1;
        }
    var = 45;
    }
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
        int var = 90;
        arrayupdation(marks,var);
        for (int i = 0; i < marks.length; i++){
            System.out.println("marks of subject "+(i+1)+": "+marks[i]); //marks is updated ,call by refrence
            System.out.println(var); //variable is not updated, call by value
        }
    }
    
}