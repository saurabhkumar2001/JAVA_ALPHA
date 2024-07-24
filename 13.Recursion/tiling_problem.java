public class tiling_problem {
    public static int tilingproblem(int n){
        if(n<=1){
            return 1;
        }
        int Verticle = tilingproblem(n-1);
        int Horizontal = tilingproblem(n-2);

        return Verticle+Horizontal;

    }
    public static void main(String[] args) {
        System.out.println("Total no ways to fix a tile in a 2Xn board is : "+tilingproblem(4));
    }
    
}