public class BestTimeBuyAndSell {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.print(maxProfit2(new int[]{7,1,5,3,6,4}));

    }
    public static int maxProfit(int[] prices){
        int min_price=prices[0];
        int max_profit=0;
        for (int i = 0; i < prices.length ; i++) {
            if(prices[i]<min_price){
                min_price=prices[i];
            } else if (prices[i]-min_price>max_profit) {
                max_profit=prices[i]-min_price;
            }
        }
        return max_profit;
    }


    public static int maxProfit2(int[] prices){
        int current_min=prices[0];
        int profit = 0;
        for (int i :prices) {
            current_min =Math.min(current_min,i);
            profit=Math.max(profit,i-current_min);

        }
        return profit;
    }
}
