public class increasingorder {
    public static void increasing(int n){
        if(n==0){
            return;
        }else{
            increasing(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        increasing(10);
    }
}
