import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author RuL
 */
public class LeetCode415 {

    public String addStrings(String num1, String num2) {
        char[] chars1 = release(num1);
        char[] chars2 = release(num2);
        int len1 = num1.length();
        int len2 = num2.length();

        int minLen = Math.min(len1, len2);
        int maxLen = Math.max(len1, len2);

        char[] res = new char[maxLen + 1];
        String ans;
        int flag = 0;
        int temp;

        for (int i = 0; i < minLen; i++) {
            temp = chars1[i] + chars2[i] - '0' - '0' + flag;
            res[i] = (char) (temp % 10 + '0');
            flag = temp / 10;
        }

        if (len1 > minLen) {
            for (int i = minLen; i < len1; i++) {
                temp = chars1[i] - '0' + flag;
                res[i] = (char) (temp % 10 + '0');
                flag = temp / 10;
            }
        }
        if (len2 > minLen) {
            for (int i = minLen; i < len2; i++) {
                temp = chars2[i] - '0' + flag;
                res[i] = (char) (temp % 10 + '0');
                flag = temp / 10;
            }
        }

        if (flag > 0) {
            res[maxLen] = (char) (flag + '0');
            ans = new String(res);
        } else {
            ans = new String(res).substring(0, maxLen);
        }
        return new StringBuilder(ans).reverse().toString();
    }

    public char[] release(String str) {
        return new StringBuilder(str).reverse().toString().toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode415().addStrings("9", "99"));
    }

}
