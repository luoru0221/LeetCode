public class LeetCode389 {

    public char findTheDifference(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int sum = 0;
        for (char c : chars2) {
            sum += c;
        }
        for (char c : chars1) {
            sum -= c;
        }
        return (char) sum;
    }

}
