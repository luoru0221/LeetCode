public class LeetCode300 {

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int[] ans = new int[len];
        java.util.Arrays.fill(ans, 1);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    ans[i] = Math.max(ans[j] + 1, ans[i]);
                }
            }
        }

        int result = ans[0];
        for(int i=0;i<len;i++){
            result = Math.max(result,ans[i]);
        }

        return result;
    }

}
