import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int len = s.length();

        if (len == 0) {
            return ans;
        }

        int left = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (left < len && right < len) {

            while (right < len && (!map.containsKey(s.charAt(right)) || map.get(s.charAt(right)) < left)) {
                map.put(s.charAt(right), right);
                right++;
            }

            ans = Math.max(ans, right - left);

            if (right < len) {
                left = map.get(s.charAt(right)) + 1;
            }
        }
        return ans;
    }

}
