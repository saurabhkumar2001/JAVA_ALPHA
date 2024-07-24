public class power {
    public static int power(int n , int x){
        if(x<1){
            return 1;
        }
        return n*power(n,x-1);
        
    }
    public static void main(String[] args) {
        int powe = power(2, 10);
        System.out.println(powe);
    }
}