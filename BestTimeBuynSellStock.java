// LeetCode 121

public class BestTimeBuynSellStock {
    public static int BuyAndSell(int[] prices) {
        int bestBuy = prices[0];
        int maxProfit = 0;

        int n = prices.length;
        for (int i = 1; i < n; i++) {
            int currentProfit = prices[i] - bestBuy;
            maxProfit = Math.max(maxProfit, currentProfit);
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return maxProfit;
    }    
    public static void main(String args[]) {
        int[] prices = {7, 1, 3, 4, 6, 2};
        System.out.println("The maximum profit we get is: "+BuyAndSell(prices));
    }
}
