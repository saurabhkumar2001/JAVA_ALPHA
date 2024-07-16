//count how many times lowercase vowel entered by the user
public class pq01 {
    public static void stringss(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch =='a'||ch =='e'||ch == 'i'||ch == 'o'||ch =='u') {
                count++;
            }
        }
        System.out.println("total lowercase vowel entered by the user is: "+count);
    }
public static void main(String[] args) {
    String str = "Saurabh kumar jha";
    stringss(str);
}
}

