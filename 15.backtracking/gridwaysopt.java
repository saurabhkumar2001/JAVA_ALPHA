public class gridwaysopt {
public static int fact(int n){
    if(n<=1){
        return 1;
    }
return n*fact(n-1);
}
 public static int grid(int n,int m){
        int ways = fact((n-1)+(m-1))/(fact(n-1) + fact(m-1));
        return ways;
    }    

    public static void main(String[] args) {
        System.out.println(grid(3, 3));
    }
}
