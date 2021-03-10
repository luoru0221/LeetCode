public class NC105 {

    /**
     * 二分查找
     *
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型 数组中第一个大于等于查找值的位置
     */
    public int upper_bound_(int n, int v, int[] a) {
        int left = 0;
        int right = n - 1;
        if (a[right] < v) {
            return n + 1;
        }
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (a[middle] >= v) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left + 1;
    }

}
