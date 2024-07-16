public class Stringcompression {
    public static void compress(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count =1; //we have to make object so that we can convert back to the string if we want to convert back to any datatype to the string we have to make the object of that datatype not the variable it give exception cannot invoke tostring to a primitive 
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) { 
//this loop will check till the last element and also it check the consecutive same numbers 
                count++;
                i++;
            }
            newstr+= str.charAt(i);
            if (count>1) {
                newstr+=count.toString();
            }
        }
        System.out.println(newstr);
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        compress(str);
    }
}
