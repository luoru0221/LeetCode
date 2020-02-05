import java.lang.reflect.Array;

public class LeetCode67 {

    public String addBinary(String a, String b) {

        int maxLen = Math.max(a.length(), b.length());
        char[] tmpA = a.toCharArray();
        char[] tmpB = b.toCharArray();
        char[] numA = new char[maxLen];
        char[] numB = new char[maxLen];

        for (int i = maxLen - 1; i >= 0; i--) {
            if (tmpA.length - (maxLen - i) >= 0) {
                numA[i] = tmpA[tmpA.length - (maxLen - i)];
            } else {
                numA[i] = 0;
            }

            if (tmpB.length - (maxLen - i) >= 0) {
                numB[i] = tmpB[tmpB.length - (maxLen - i)];
            } else {
                numB[i] = 0;
            }
        }

        char[] ans = new char[maxLen+1];
        Integer flag = 0;
        for(int i=maxLen-1;i>=0;i--){
            ans[i] = add(numA[i],numB[i],flag);
        }
        if(flag==1){
            System.arraycopy(ans,0,ans,1,maxLen);
        }
        return String.valueOf(ans, 0, maxLen + flag);
    }

    char add(char a, char b, Integer flag) {
        int ans = 0;
        if (a + b - '0' * 2 + flag >= 2) {
            ans = a + b - '0' * 2 + flag - 2;
            flag = 1;
        }else{
            ans = a + b - '0' * 2 + flag;
            flag = 0;
        }
        return (char)(ans+'0');
    }

    public static void main(String[] args) {
        LeetCode67 leetCode67 = new LeetCode67();
        System.out.println(leetCode67.addBinary("11","1"));
    }
}
