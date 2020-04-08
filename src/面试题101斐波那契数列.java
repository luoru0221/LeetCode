public class 面试题101斐波那契数列 {

    static int[] ans = new int[101];

    public int fib(int n) {
        init(n);
        return ans[n];
    }

    private void init(int n) {
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            ans[i] = (ans[i - 1] + ans[i - 2]) % 1000000007;
        }
    }
}
