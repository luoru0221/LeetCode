public class LeetCode55 {
    public boolean canJump(int[] nums) {

        int len = nums.length;
        int dis = 1;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < dis) {
                dis++;
            } else {
                dis = 1;
            }
        }
        return dis <= 1;
    }

}
