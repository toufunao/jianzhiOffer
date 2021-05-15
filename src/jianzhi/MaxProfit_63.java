package jianzhi;

public class MaxProfit_63 {
    public int maxProfit(int[] prices) {
        int profit=0;
        int cost=Integer.MAX_VALUE;
        for (int price:prices){
            cost=Math.min(cost,price);
            profit=Math.max(profit,price-cost);
        }
        return profit;
    }
}
