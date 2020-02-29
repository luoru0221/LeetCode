import java.util.Arrays;

public class LeetCode14 {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int num = strs.length;
        if (num == 0) {
            return "";
        }
        int len1 = strs[0].length();
        int len2 = strs[num - 1].length();
        int len = Math.min(len1, len2);
        char[] tmp = new char[len];

        int cnt = len;
        for (int i = 0; i < len; i++) {
            if (strs[0].charAt(i) == strs[num - 1].charAt(i)) {
                tmp[i] = strs[0].charAt(i);
            } else {
                cnt = i;
                break;
            }
        }

        return new String(tmp, 0, cnt);
    }

}
