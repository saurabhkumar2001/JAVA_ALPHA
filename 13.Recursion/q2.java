public class q2 {
    public static void conversion(int n){
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return;
        }
        int lastdigit = n%10;
        conversion(n/10);
        System.out.print(arr[lastdigit]+" ");
      
    }
    public static void main(String[] args) {
        conversion(1947);
    }
}
