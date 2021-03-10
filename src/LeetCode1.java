import java.util.Arrays;

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

        int[] arr = new int[]{1,3,5,7,9};
        System.out.println(Arrays.binarySearch(arr,8));
    }

}
