public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int oneIndex = m - 1;
        int towIndex = n - 1;
        while (oneIndex >= 0 && towIndex >= 0) {
            if (nums1[oneIndex] > nums2[towIndex]) {
                nums1[index--] = nums1[oneIndex--];
            } else {
                nums1[index--] = nums2[towIndex--];
            }
        }
        while (towIndex >= 0) {
            nums1[index--] = nums2[towIndex--];
        }
    }
}
