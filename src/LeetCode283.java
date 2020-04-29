public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        for (int p = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p++] = temp;
            }
        }
    }
}