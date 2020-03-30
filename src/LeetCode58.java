public class LeetCode58 {

    public int lengthOfLastWord(String s) {
        int ans = 0;
        boolean haveRead = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                haveRead = true;
                ans++;
            }
            if (haveRead && !(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                break;
            }
        }
        return ans;
    }
}
