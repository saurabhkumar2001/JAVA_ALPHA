public class substring {
    public static String substrings(String sc, int si,int ei){
        String str = "";
        for (int i = si; i < ei; i++) {
             str += sc.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String sc = "HelloWorld";
        int si = 2,ei = 6;
      String val =  substrings(sc,si,ei);
      System.out.println(val);
    }
}
