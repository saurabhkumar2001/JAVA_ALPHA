import java.util.Scanner;
public class si {
    public static void main(String[] args) {
        int p,r,t;
        float si;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        r = sc.nextInt();
        t = sc.nextInt();
        si = (p*r*t)/100;
        System.out.println(si);

    }
}
