public class LeetCode4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 > len2) {
            //保证len1<=len2
            return findMedianSortedArrays(nums2, nums1);
        }

        int left = 0;
        int right = len1;
        int mid1;
        int mid2;
        while (left <= right) {
            mid1 = (left + right) / 2;
            mid2 = (len1 + len2 + 1) / 2 - mid1;

            if (mid1 != 0 && mid2 != len2 && nums1[mid1 - 1] > nums2[mid2]) {
                //mid1需要减小
                right = mid1 - 1;
            } else if (mid1 != len1 && mid2 != 0 && nums2[mid2 - 1] > nums1[mid1]) {
                //mid2需要增大
                left = mid1 + 1;
            } else {
                int leftMax;  //左边部分最大值
                if (mid1 == 0) {
                    leftMax = nums2[mid2 - 1];
                } else if (mid2 == 0) {
                    leftMax = nums1[mid1 - 1];
                } else {
                    leftMax = Math.max(nums1[mid1 - 1], nums2[mid2 - 1]);
                }

                int rightMin;
                if ((len1 + len2) % 2 == 0) {
                    //偶数
                    if (mid1 == len1) {
                        rightMin = nums2[mid2];
                    } else if (mid2 == len2) {
                        rightMin = nums1[mid1];
                    } else {
                        rightMin = Math.min(nums1[mid1], nums2[mid2]);
                    }
                    return (leftMax + rightMin) / 2.0;
                } else {
                    //奇数
                    return leftMax;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LeetCode4 leetCode4 = new LeetCode4();
        System.out.println(leetCode4.findMedianSortedArrays(new int[]{2}, new int[]{}));
    }
}
