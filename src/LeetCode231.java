public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {
        int tmp = 1;
        while (tmp <= n) {
            if (tmp == n) {
                return true;
            }
            tmp *= 2;
        }
        return false;
    }
}
