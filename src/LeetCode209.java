/**
 * 本题坑点：当没有答案时，答案为0
 */
public class LeetCode209 {

    public int minSubArrayLen(int s, int[] nums) {
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int ans = nums.length == 0 ? 0 : Integer.MAX_VALUE;
        int len = nums.length;

        while (startIndex <= endIndex && startIndex < len) {
            while (sum < s && endIndex < len) {
                sum += nums[endIndex++];
            }
            if (startIndex == 0 && endIndex == len && sum < s) {
                ans = 0;
            }
            if (sum >= s && endIndex - startIndex < ans) {
                ans = endIndex - startIndex;
            }
            sum -= nums[startIndex];
            startIndex++;
        }
        return ans;
    }

}
