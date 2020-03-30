public class LeetCode344 {

    public void reverseString(char[] s) {
        int len = s.length;
        char temp;
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
