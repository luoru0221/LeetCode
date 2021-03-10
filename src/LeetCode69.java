public class LeetCode69 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid;
        int ans = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode69 leetCode69 = new LeetCode69();
        //System.out.println(leetCode69.mySqrt(8));
        //System.out.println(leetCode69.mySqrt(4));
        System.out.println(leetCode69.mySqrt(12));
    }
}
