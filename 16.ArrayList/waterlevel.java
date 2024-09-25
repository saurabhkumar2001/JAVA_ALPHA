import java.util.ArrayList;

public class waterlevel {

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int max = Integer.MIN_VALUE;
        int h = 0;
        ArrayList<Integer> level = new ArrayList<>();
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (height[i] < height[j]) {
                    h = height[i];
                }
                else {
                    h = height[j];
                }

                level.add(Math.abs(h*(j-i)));
            }
        }

        for (int i = 0; i < level.size(); i++) {
            if (max < level.get(i)) {
                max = level.get(i);
            }
        }

        System.out.println(max);
    }
}
