public class LeetCode34 {

    public int[] searchRange(int[] nums, int target) {
        int maxIndex = nums.length - 1;
        int[] ans = new int[]{-1,-1};

        if(nums.length==0){
            return ans;
        }
        int left = 0;
        int right = maxIndex;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if(nums[left]==target){
            ans[0] = left;
        }else{
            return ans;
        }

        right = maxIndex+1;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (target >= nums[mid]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        ans[1] = left-1;
        return ans;
    }
}
