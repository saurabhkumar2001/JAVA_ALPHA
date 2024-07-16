
public class coverttouppercase {
    public static String UpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        //Character.toUpperCase is use to return uppercase value
        sb.append(ch);
        for (int i = 1;i<str.length();i++) {
            if(str.charAt(i)== ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                  
            }else sb.append(str.charAt(i));

            
        }
        return sb.toString(); //it will conver any data type to string but that is not of variable that is of object like sb as object of stringbuilder 
        
    }
    public static void main(String[] args) {
        String str = "hello i am saurabh kumar jha";
        System.out.println(UpperCase(str));
    }
}
