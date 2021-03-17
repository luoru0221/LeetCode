/**
 * @author RuL
 */
public class LeetCode215 {

    /**
     * 在数组nums中查找第k大的数
     *
     * @param nums 待查找的目标数组
     * @param k    第k大的数
     * @return 数组中第k大的数
     */
    public int findKthLargest(int[] nums, int k) {
        return findKthLargestInInterval(nums, 0, nums.length - 1, k);
    }


    /**
     * 在start-end区间中找第k大的数
     *
     * @param nums  数组
     * @param start 区间左端点
     * @param end   区间右端点
     * @param k     第k大的数
     * @return 区间start-end中第k大的数
     */
    public int findKthLargestInInterval(int[] nums, int start, int end, int k) {
        int left = start;
        int right = end;
        int sentinel = nums[start];

        while (left < right) {
            while (left < right && nums[right] <= sentinel) {
                //从右往左找第一个比sentinel大的数
                right--;
            }
            if (left < right) {
                nums[left++] = nums[right];
            }

            while (left < right && nums[left] >= sentinel) {
                //从左往右找第一个比sentinel小的数
                left++;
            }
            if (left < right) {
                nums[right--] = nums[left];
            }

        }
        nums[left] = sentinel;

        //比sentinel大的数的数量（左边部分的数量）
        int gather = left - start;

        if (gather == k - 1) {
            return sentinel;
        } else if (gather > k - 1) {
            //在左边部分查找
            return findKthLargestInInterval(nums, start, left - 1, k);
        } else {
            //在右边部分查找
            return findKthLargestInInterval(nums, left + 1, end, k - gather - 1);
        }
    }


    public static void main(String[] args) {
        LeetCode215 leetCode215 = new LeetCode215();
        System.out.println(leetCode215.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }


}
