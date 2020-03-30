public class LeetCode125 {

    public boolean isPalindrome(String s) {

        char[] temp = s.toCharArray();
        int index = 0;
        char[] chars = new char[temp.length];

        for (char c : temp) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                chars[index++] = c;
            }
        }

        String s1 = new String(chars,0,index);
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(s1);
        System.out.println(s2);
        return s1.equalsIgnoreCase(s2);
    }

    public static void main(String[] args) {
        LeetCode125 leetCode125 = new LeetCode125();
        boolean palindrome = leetCode125.isPalindrome("A man, a plan, a canal: Panama");
    }
}
