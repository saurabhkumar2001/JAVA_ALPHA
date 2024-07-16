import java.util.*;
public class direction {
    public static float getshortespath(String str){
        int x = 0,y = 0;
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (i == 'W') {
                x--;
            }
            else if (i == 'E') {
                x++;
            }
            else if (i == 'N') {
                y++;
            }
            else{
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string for finding the direction : ");
        String str = sc.nextLine();
        System.out.println(getshortespath(str));
    }
}
