public class 面试题21调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int temp;

        flag:
        while (left < right) {
            while (nums[left] % 2 == 1) {
                left++;
                if (left >= right) {
                    break flag;
                }
            }
            while (nums[right] % 2 == 0) {
                right--;
                if (left >= right) {
                    break flag;
                }
            }
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
