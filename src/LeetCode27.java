public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int sum = nums.length;
        for (int i = 0; i < sum; i++) {
            if (nums[i] == val) {
                sum--;
                if (sum - i >= 0) {
                    System.arraycopy(nums, i + 1, nums, i, sum - i);
                }
                i--;
            }
        }
        return sum;
    }
}
