public class LeetCode258 {

    public int addDigits(int num) {
        while (num >= 10) {
            num = add(num);
        }
        return num;
    }

    public int add(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

}
