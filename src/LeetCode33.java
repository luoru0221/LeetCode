/**
 * @author RuL
 */
public class LeetCode33 {

    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public int search(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (nums[middle] <= nums[right]) {
            //右边部分有序
            if (target >= nums[middle] && target <= nums[right]) {
                //在这个范围内
                return binarySearch(nums, middle, right, target);
            } else {
                //在左边部分
                return search(nums, left, middle - 1, target);
            }
        } else {
            //左边部分有序
            if (target >= nums[left] && target <= nums[middle]) {
                //在这个范围内
                return binarySearch(nums, left, middle, target);
            } else {
                //在右边部分
                return search(nums, middle + 1, right, target);
            }
        }
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        int ans = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                ans = middle;
                break;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return ans;
    }
}
