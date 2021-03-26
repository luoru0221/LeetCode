/**
 * @author RuL
 */
public class LeetCode42 {

    public int trap(int[] height) {
        int sum = 0;
        int len = height.length;
        int[] max_left = new int[len];
        int[] max_right = new int[len];

        for (int i = 1; i < len; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
        }
        for (int i = len - 2; i > 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }

        int minLeftRight;
        for (int i = 1; i < len - 1; i++) {
            minLeftRight = Math.min(max_left[i], max_right[i]);

            if (minLeftRight > height[i]) {
                sum += (minLeftRight - height[i]);
            }
        }

        return sum;
    }
}
