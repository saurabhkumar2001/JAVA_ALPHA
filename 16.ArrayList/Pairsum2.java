//  approach 2 pointer array is sorted and rotated we have to find the sum of two is equal to the target .

import java.util.ArrayList;

public class Pairsum2 {
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        // find pivot from we have to break the list.
        int pivot = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int n = list.size();
        int rp = pivot, lp = pivot + 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            } else {
                lp = (lp + 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        if (pairsum2(list, target)) {
            System.out.println("target is found");
        } else {
            System.out.println("target is not found");
        }
    }
}
