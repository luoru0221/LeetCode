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

    public static void main(String[] args) {
        LeetCode209 leetCode209 = new LeetCode209();
        int ans = leetCode209.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(ans);
    }
}
