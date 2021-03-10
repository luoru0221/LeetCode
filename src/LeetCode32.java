import java.util.Arrays;

public class LeetCode32 {
    public int longestValidParentheses(String s) {
        int len = s.length();

        //以第i个位置结尾的最长有效长度
        int[] dp = new int[len];
        Arrays.fill(dp, 0);
        int max = 0;

        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == '(') {
                //以左括号结尾，无效
                continue;
            }

            if (s.charAt(i - 1) == '(') {
                // ...()这种情况
                dp[i] = i >= 2 ? (dp[i - 2] + 2) : 2;
            } else {
                // ...))这种情况
                if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2;
                    if (i - dp[i - 1] - 2 >= 0) {
                        dp[i] += dp[i - dp[i - 1] - 2];
                    }
                }
            }

            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
