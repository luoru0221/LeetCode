import java.util.Arrays;

public class LeetCode31 {

    public void nextPermutation(int[] nums) {
        int right = nums.length - 1;
        int left = nums.length - 1;

        while (left > 0 && nums[left] < nums[left - 1]) {
            left--;
        }
        left--;
        if (left == -1) {
            Arrays.sort(nums);
        } else {
            //找到第一个比nums[left]大的元素
            while (nums[right] <= nums[left]) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            Arrays.sort(nums, left + 1, nums.length);
        }
    }

    public static void main(String[] args) {
        LeetCode31 leetCode31 = new LeetCode31();
        int[] ints = new int[]{1, 2, 3};
        leetCode31.nextPermutation(ints);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}
