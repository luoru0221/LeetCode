public class LeetCode7 {

    public int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return (int) ans == ans ? (int) ans : 0;
    }

    public static void main(String[] args) {
        LeetCode7 leetCode7 = new LeetCode7();
        System.out.println(leetCode7.reverse(0));
        System.out.println(leetCode7.reverse(123456));
        System.out.println(leetCode7.reverse(-123456));
    }
}
