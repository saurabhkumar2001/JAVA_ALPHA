public class stringfunc {
    public static void main(String[] args) {
        String name;
        name = "Saurabh kumar jha";
        //to find the length 
        System.out.println(name.length());
        String statement = "my name is ";
        //concatination
        String message = statement + name;
        System.out.println(message);
        //we can find the character in between the string
        System.out.println(message.charAt(23));
    }
}
