public class BestTimeBuyAndSell {
    public static void main(String[] args) {
        System.out.print(maxProfit(new int[]{7,1,5,3,6,4}));

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
}
