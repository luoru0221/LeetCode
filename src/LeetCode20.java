import java.util.Stack;

public class LeetCode20 {

    boolean isTrue(char a, char b) {
        return a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}';
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (isTrue(stack.peek(), s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LeetCode20 leetCode20 = new LeetCode20();
        System.out.println(leetCode20.isValid("(]"));
    }
}
