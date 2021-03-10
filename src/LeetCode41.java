public class LeetCode41 {

    public static int firstMissingPositive(int[] nums) {
        int temp;
        if (nums == null) {
            return 1;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] < length && nums[i] > 0 && nums[i] != nums[nums[i] - 1]) {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                if (temp <= i) {
                    i--;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return length + 1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 1}));
        System.out.println(firstMissingPositive(new int[]{-1, 4, 2, 1, 9, 10}));
    }
}
