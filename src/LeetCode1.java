public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int len = nums.length;

        flag:
        for (int i = 0; i < len; i++) {
            int tmp = target-nums[i];
            for (int j = i + 1; j < len; j++) {
                if(nums[j]==tmp){
                    ans[0] = i;
                    ans[1] = j;
                    break flag;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode1 leetCode1 = new LeetCode1();

        int[] nums = new int[]{3,2,4};
        int[] ints = leetCode1.twoSum(nums, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
