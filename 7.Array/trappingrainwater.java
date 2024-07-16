public class trappingrainwater{
    public static void main(String[] args) {
        int barlevel[] = {4,2,0,6,3,2,5};
        int leftMax[] = new int[barlevel.length];
        int rightMax[] = new int[barlevel.length];
    //trap k liye rightmax and leftmax k minimum chaiye usse hume waterlevel mil jayege fir usko barlevel se minus krke trap nikal aayega aur agar saare trap ko eksaath plus kr denge toh full trap aa jayega
    leftMax[0] = barlevel[0];
    for (int i = 1; i < barlevel.length; i++) {
        leftMax[i]=Math.max(barlevel[i],leftMax[i-1]);
    }
    rightMax[barlevel.length-1] = barlevel[barlevel.length-1];
    for (int i = barlevel.length-2; i >=0 ; i--) {
        rightMax[i] = Math.max(rightMax[i+1],barlevel[i]);
    }
    int sum = 0;
    for (int i = 0; i < barlevel.length; i++) {
        int waterlevel=Math.min(leftMax[i],rightMax[i]);
           int trap = waterlevel-barlevel[i];
           System.out.print(trap+" ");
           sum+=trap;
    }
    System.out.println("total rain water trapped is: "+sum);
    }
}