import java.util.*;
public class ternaryoperatorreportcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks ? ");
        int result = sc.nextInt();
        String res =(result > 33)?"pass":"fail";
        System.out.println(res);
    }
}
