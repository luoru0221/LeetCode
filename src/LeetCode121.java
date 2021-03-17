public class LeetCode121 {

    public int maxProfit(int[] prices) {
        int len = prices.length;

        //当前扫描到的最小值
        int minValue = Integer.MAX_VALUE;
        //当前扫描到的最大利益
        int[] maxInterest = new int[len + 1];
        maxInterest[0] = 0;

        for (int i = 0; i < len; i++) {
            minValue = Math.min(minValue, prices[i]);
            maxInterest[i + 1] = Math.max(maxInterest[i], prices[i] - minValue);
        }

        return maxInterest[len];
    }
}
