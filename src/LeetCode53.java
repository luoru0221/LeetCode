/**
 * @author RuL
 */
public class LeetCode53 {

    public int maxSubArray(int[] nums) {
        int maxSubSum = nums[0];
        int tempSum = nums[0];
        int len = nums.length;

        for (int i = 1; i < len; i++) {
            if (tempSum > 0) {
                //之前的和为正数，加上当前元素
                tempSum += nums[i];
            } else {
                //之前的和为负数，直接丢弃
                tempSum = nums[i];
            }
            //更新最大和
            maxSubSum = Math.max(maxSubSum, tempSum);
        }
        return maxSubSum;
    }
}
