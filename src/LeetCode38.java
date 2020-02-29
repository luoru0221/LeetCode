public class LeetCode38 {

    public String countAndSay(int n) {

        String[] ans = new String[35];
        ans[1] = "1";

        for (int i = 2; i <= 30; i++) {
            StringBuilder tmp = new StringBuilder("");
            int count = 1;
            for (int j = 1; j < ans[i - 1].length(); j++) {
                if (ans[i - 1].charAt(j) != ans[i - 1].charAt(j - 1)) {
                    tmp.append(count);
                    tmp.append(ans[i - 1].charAt(j - 1));
                    count = 0;
                }
                count++;
            }
            tmp.append(count);
            tmp.append(ans[i - 1].charAt(ans[i - 1].length()-1));
            ans[i] = tmp.toString();
        }

        return ans[n];
    }

}
