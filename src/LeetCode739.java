public class LeetCode739 {

    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] result = new int[len];
        result[len - 1] = 0;

        for (int i = len - 2; i >= 0; i--) {
            compare(i,i+1,result,T);
        }
        return result;
    }

    void compare(int one,int another,int[] result,int[] T){
        if (T[one] < T[another]) {
            result[one] = another-one;
        } else {
            if (result[another] == 0) {
                result[one] = 0;
            } else {
                //跟比another温度高的那一天继续比较
                compare(one,another+result[another],result,T);
            }
        }
    }

    public static void main(String[] args) {
        LeetCode739 leetCode739 = new LeetCode739();
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ints = leetCode739.dailyTemperatures(T);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
        System.out.println();
    }
}
