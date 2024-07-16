public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <='z'; i++) {
            sb.append(i); //O(26)
        }
        System.out.println(sb);
    }
}
