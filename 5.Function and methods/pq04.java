// Search about(Google) & use the following methods of the Math class in Java:
// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )

public class pq04 {
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else
            return y;
    }
    public static void sqrt(int x) {
        for (int i = 1; i < x; i++) {
            if(x%i==0) {
                if(i*i==x){
                    System.out.println(i);
                }
            }
        }
    }

    public static int pow(int x,int y) {
        for (int i = 1; i < y; i++) {
            x *= x;
        }
        return x;
    }

    public static int avg(int x, int y) {
        return (x+y)/2;
    }

    public static int abs(int x) {
        return x-(2*x);
    }

    public static int min(int x, int y) {
    if (x < y) {
            return x;
        } else
            return y;
    }

    public static void main(String[] args) {
        int x = -12;
        int y = 2;
        int c = 9;
        System.out.println(max(x, y));
        System.out.println(min(x, y));
        System.out.println(abs(x));
        System.out.println(avg(x, y));
        // System.out.println(pow(x, y));
        // System.out.println(sqrt(c));

    }

}
