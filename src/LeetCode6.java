/**
 * Z字型变换
 */
public class LeetCode6 {
    public String convert(String s, int numRows) {
        //一个周期的字符数
        int cycle = numRows * 2 - 2;
        if (numRows == 1) {
            cycle = 1;
        }
        //总长度
        int n = s.length();
        char[] sChars = s.toCharArray();
        char[] ans = new char[n];

        int index = 0;

        //遍历每一行
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycle) {
                ans[index++] = sChars[i + j];

                //除了第一行和最后一行，每个周期有两个数在同一行
                if (i != 0 && i != numRows - 1 && j + cycle - i < n) {
                    ans[index++] = sChars[j + cycle - i];
                }
            }
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        LeetCode6 leetCode6 = new LeetCode6();
        System.out.println(leetCode6.convert("A", 1));
    }
}
