import java.util.*;
public class PairSum1 {
    public static boolean pairsum1twopointerapproach(ArrayList<Integer> list , int target){
        int lp = 0; int rp = list.size()-1;
        while (lp!=rp) {
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }else if (list.get(lp)+list.get(rp)>target) {
                rp--;
            }
            else
            {
                lp++;
            }       
        }
     
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        if(pairsum1twopointerapproach(list,target)) {
          System.out.println("target is found");  
        }else{
            System.out.println("target is not found");
        }
    }
}
