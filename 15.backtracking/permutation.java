public class permutation {
    public static void getpermutaion(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            String newstr = str.substring(0, j) + str.substring(j + 1);
            getpermutaion(newstr, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        getpermutaion(str, "");
    }
}
