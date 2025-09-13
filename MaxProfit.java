public class MaxProfit {
    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();
        int[] prices = {7,1,5,3,6,4};
        int result = solution.maxProfit(prices);
        System.out.println(result);
    }
    
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
