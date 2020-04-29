public class LeetCode345 {
    public String reverseVowels(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = len - 1;
        while (left < right) {
            while (left < right && isVowels(chars[left])) {
                left++;
            }
            while (left < right && isVowels(chars[right])) {
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    public boolean isVowels(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'&&c != 'A' &&
                c != 'E' && c != 'I' && c != 'O' && c != 'U';
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode345().reverseVowels("hello"));
    }
}
