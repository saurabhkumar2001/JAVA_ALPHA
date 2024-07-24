public class friends_And_Pairing {
    public static int friendsPairing(int n){
        if(n<2){
           return n; 
        }
        int single = friendsPairing(n-1);
        int pair = friendsPairing(n-2);
        int pairways = (n-1)*pair;
        int totways = single+pairways;
        return totways;

    }
    public static void main(String[] args) {
        
        int totways = friendsPairing(4);
        System.out.println("totways "+ totways);
        
    }
}