import java.util.HashMap;

public class LeetCode13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        char[] chars = s.toCharArray();
        int ans = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i < chars.length - 1 && hashMap.get(chars[i]) < hashMap.get(chars[i + 1])) {
                ans -= hashMap.get(chars[i]);
            } else {
                ans += hashMap.get(chars[i]);
            }
        }
        return ans;
    }
}
