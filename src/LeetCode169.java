public class LeetCode169 {
    /**
     * 摩尔投票法
     * 先假设多数元素为第一个数
     * 后面遇到相同的count+1,否则count-1
     * 如果count=0,换个数继续投票
     */
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int len = nums.length;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (result == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0 && i < len - 1) {
                    result = nums[i + 1];
                }
            }
        }
        return result;
    }
}
