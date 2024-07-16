public class comparision {
    public static void main(String[] args) {
        String str = "Tony";
        String str1 = "Tony";
        String sc = new String("Tony");
        if (str == str1) {
            System.out.println("string are equal ");
        }else{
            System.out.println("Strings are not equal");
        }
        if (sc == str) {
            System.out.println("Strings are equal");
        }
        else
        System.out.println("String are not equal");// they check for the object level only but they dont check for the value 
        if (str.equals(sc)) {
            System.out.println("Strings are equal");
        }
        else
            System.out.println("String are not equal");// it check for the value 
        if(str.equals(sc)){
            System.out.println("Strings are equal");
        }else System.out.println("not equals");   
    }

}
