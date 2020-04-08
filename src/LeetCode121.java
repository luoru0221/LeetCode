public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] dp = new int[len + 1];
        dp[0] = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            minValue = Math.min(minValue, prices[i]);
            dp[i + 1] = Math.max(dp[i], prices[i] - minValue);
        }
        return dp[len];
    }
}
