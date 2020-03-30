public class LeetCode26 {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                if (len - 1 - i >= 0) System.arraycopy(nums, i + 1, nums, i, len - 1 - i);
                i--;
                len--;
            }
        }
        return len;
    }

}
