public class decreasingorder {
   
   public static void decreasing(int n){
    if (n==1) {
        System.out.println(n);
        return;
    }else{
        System.out.println(n);
        decreasing(n-1);
    }
   }
    public static void main(String[] args) {
    decreasing(10);    
    }
    
}