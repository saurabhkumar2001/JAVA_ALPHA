
public class stock {
    public static void main(String[] args) {
        int bp = Integer.MAX_VALUE;
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int profit[] = new int[prices.length];
        int maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            bp = Math.min(prices[i], bp);
            int sp = prices[i];
            profit[i] = sp - bp;
            if (maxprofit<profit[i]) {
                maxprofit = profit[i];
            }
            System.out.println(" profit is on the day " +  (i+1) + " if buying price is " + bp + " and selling price is "
            + sp + ": " + profit[i]); 
        }
        System.out.println("max profit is: "+maxprofit);
    }

}
