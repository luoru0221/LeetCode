public class LeetCode70 {

    public int climbStairs(int n) {
        int[] ans = new int[105];
        ans[1] = 1;
        ans[2] = 2;
        for (int i = 3; i < 105; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }

}
