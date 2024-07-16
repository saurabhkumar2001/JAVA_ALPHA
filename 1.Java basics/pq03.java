/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
import java.util.*;
public class pq03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil: ");
        int pencil = sc.nextInt();
        System.out.println("Enter cost of pen: ");
        int pen = sc.nextInt();
        System.out.println("Enter cost of eraser: ");
        int eraser = sc.nextInt();
        int sum = pen+pencil+eraser;
        float bill = (sum*18)/100+sum;
        System.out.println("your bill including 18 percent gst is : "+bill);

    }
}
