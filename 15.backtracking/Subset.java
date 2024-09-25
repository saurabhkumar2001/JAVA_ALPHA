public class Subset
{
    public static void findsubset(String str,String ans,int i){
    //base case
    if (i==str.length()){
        System.out.println(ans);
        return;
    }
    //recursion
    //yes choice
    findsubset(str, ans+str.charAt(i),i+1);
    //no choice 
    findsubset(str, ans, i+1);
    }
    public static void main(String[] args) {
       String str = "abc";
       String ans = "";
       findsubset(str,ans,0);
    }
}
