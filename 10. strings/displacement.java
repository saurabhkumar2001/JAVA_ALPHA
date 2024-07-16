public class displacement {
    public static float disp(String path){
        int x = 0,y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'S':
                    y--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'E':
                    x--;
                    break;
                case 'W':
                    x++;
                    break;
            
                default:
                    break;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path is : "+disp(path));

    }
}
