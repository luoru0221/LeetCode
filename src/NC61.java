import java.util.Arrays;
import java.util.HashMap;

public class NC61 {

    /**
     * @param numbers int整型一维数组
     * @param target  int整型
     * @return int整型一维数组
     */
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> index = new HashMap<>();
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            index.put(numbers[i], i + 1);
        }
        Arrays.sort(numbers);
        int left = 0;
        int right = len - 1;

        int sum;
        while ((sum = numbers[left] + numbers[right]) != target) {
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{index.get(numbers[left]), index.get(numbers[right])};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
