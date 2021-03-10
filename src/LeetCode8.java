/**
 * @author RuL
 */
public class LeetCode8 {

    public int myAtoi(String s) {
        if (s == null) {
            return 0;
        }

        s = removeSpaces(s);
        int len = s.length();
        if (len == 0) {
            return 0;
        }

        if (isNumber(s.charAt(0))) {
            long ans = 0;
            char c;
            for (int i = 0; i < len; i++) {
                if (isNumber(c = s.charAt(i))) {
                    ans = ans * 10 + c - '0';
                } else {
                    break;
                }
                if (ans >= (2L << 30) - 1) {
                    break;
                }
            }
            if (ans >= (2L << 30) - 1) {
                return (int) ((2L << 30) - 1);
            }
            return (int) ans;
        }
        if (s.charAt(0) == '+') {
            long ans = 0;
            char c;
            for (int i = 1; i < len; i++) {
                if (isNumber(c = s.charAt(i))) {
                    ans = ans * 10 + c - '0';
                } else {
                    break;
                }
                if (ans >= (2L << 30) - 1) {
                    break;
                }
            }
            if (ans >= (2L << 30) - 1) {
                return (int) ((2L << 30) - 1);
            }
            return (int) ans;
        }
        if (s.charAt(0) == '-') {
            long ans = 0;
            char c;
            for (int i = 1; i < len; i++) {
                if (isNumber(c = s.charAt(i))) {
                    ans = ans * 10 + c - '0';
                } else {
                    break;
                }
                if (ans >= 2L << 30) {
                    break;
                }
            }
            if (ans >= 2L << 30) {
                return (int) -(2L << 30);
            }
            return (int) -ans;
        }
        return 0;
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private String removeSpaces(String s) {
        boolean isLead = true;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c;
            if ((c = s.charAt(i)) != ' ') {
                builder.append(c);
                isLead = false;
            }
            if (c == ' ' && !isLead) {
                break;
            }
        }
        return builder.toString();
    }


}
