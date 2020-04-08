public class LeetCode67 {

    public String addBinary(String a, String b) {

        int maxLen = Math.max(a.length(), b.length());
        int minLen = Math.min(a.length(), b.length());
        boolean aBigger = a.length() > b.length();
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        char[] tmpA = sba.reverse().toString().toCharArray();
        char[] tmpB = sbb.reverse().toString().toCharArray();
        int ansLen = maxLen;

        char[] ans = new char[maxLen + 1];
        int carry = 0;
        int temp;
        for (int i = 0; i < minLen; i++) {
            temp = tmpA[i] + tmpB[i] - 2 * '0' + carry;
            carry = temp / 2;
            ans[i] = (char) (temp % 2 + '0');
        }
        for (int i = minLen; i < maxLen; i++) {
            temp = (aBigger ? tmpA[i] : tmpB[i]) - '0' + carry;
            carry = temp / 2;
            ans[i] = (char) (temp % 2 + '0');
        }
        if (carry > 0) {
            ans[maxLen] = (char) (carry + '0');
            ansLen = maxLen + 1;
        }
        StringBuilder stringBuilder = new StringBuilder(new String(ans, 0, ansLen));
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        LeetCode67 leetCode67 = new LeetCode67();
        System.out.println(leetCode67.addBinary("11", "1"));
    }
}
