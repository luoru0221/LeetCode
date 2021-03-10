public class LeetCode5 {

    public String longestPalindrome(String s) {
        int max = 0;
        int len = s.length();

        int index = 0;
        int left;
        int right;
        int tmp;

        int leftIndex = 0;
        int rightIndex = 0;

        //奇数情况
        while (index < len) {
            left = index - 1;
            right = index + 1;
            tmp = 1;
            while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                tmp += 2;
            }
            if (max < tmp) {
                max = tmp;
                leftIndex = left;
                rightIndex = right;
            }
            index++;
        }

        index = 1;
        //偶数情况
        while (index < len) {
            left = index - 1;
            right = index;
            tmp = 0;
            while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                tmp += 2;
            }
            if (max < tmp) {
                max = tmp;
                leftIndex = left;
                rightIndex = right;
            }
            index++;
        }
        return s.substring(leftIndex + 1, rightIndex);
    }


}
