public class binary_string_problem {
    public static void binaryProblem(int n,String str,int lp){
        if(n==0){
            System.out.println(str);
            return; 
        }
        binaryProblem(n-1, str+"0",0);
        if(lp==0){
            binaryProblem(n-1, str+"1", 1);
        }
    }
    public static void main(String[] args) {
        binaryProblem(3," ", 0);
    }
}
