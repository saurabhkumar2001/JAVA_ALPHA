import java.util.*;

public class pq03 {
    public static int stockprices(int prices[]){
    int buying_price = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
        int selling_price = prices[i];
        if(selling_price>buying_price){
           profit =Math.max(selling_price - buying_price,profit);
        }
    }
    return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the days");
        int l = sc.nextInt();
            System.out.println("Enter the prices");
        int prices[] = new int[l];
        for (int i = 0; i < l; i++) {
            prices[i] = sc.nextInt();
        }
       int p = stockprices(prices);
       System.out.println("maximum profit will be : "+p);
    }
}
