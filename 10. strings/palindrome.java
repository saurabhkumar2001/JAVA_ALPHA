public class palindrome {
    public static void palindrome_check(String name){
        boolean ispalindrome = false;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==name.charAt(name.length()-i-1)){
                ispalindrome = true;
            }
        }
        if (ispalindrome==true){
            System.out.println("this string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
    public static void main(String[] args) {
        String name = "racercar";
        palindrome_check(name);
    }
    
}