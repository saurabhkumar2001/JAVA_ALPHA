public class fibannociSeries {
    public static int fibannoci(int n ){
        if(n<=1){
            return n;
        }
        return fibannoci(n-1)+fibannoci((n-2));
    }
    public static void main(String[] args) {
        System.out.println(fibannoci(5));
    }
}
