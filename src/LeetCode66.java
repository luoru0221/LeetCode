import java.util.Arrays;

public class LeetCode66 {

    public int[] plusOne(int[] digits) {
        int arrLen = digits.length;
        int[] tmpAns = new int[arrLen + 1];

        int temp = 1;
        for (int i = arrLen - 1; i >= 0; i--) {
            tmpAns[i] = (digits[i] + temp) % 10;
            temp = (digits[i] + temp) / 10;
        }
        if (temp != 0) {
            int[] ans = new int[arrLen+1];
            System.arraycopy(tmpAns, 0, ans, 1, arrLen);
            ans[0] = 1;
            return ans;
        }else{
            int[] ans = new int[arrLen];
            System.arraycopy(tmpAns,0,ans,0,arrLen);
            return ans;
        }
    }

    public static void main(String[] args) {
        LeetCode66 leetCode66 = new LeetCode66();
        int[] ans = leetCode66.plusOne(new int[]{9, 9, 9});
        System.out.println(Arrays.toString(ans));
    }
}
