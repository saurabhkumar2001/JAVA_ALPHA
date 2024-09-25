// approach of linear time complexity two pointer approach 

import java.util.ArrayList;

public class waterlevelO {
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int lp = 0;
        int rp = height.length -1;int max = 0;
        ArrayList<Integer> level = new ArrayList<>();
        while(lp<rp){
            int h = Math.min(height[lp],height[rp]);
            level.add(h*(rp-lp));
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
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
