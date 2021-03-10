public class LeetCode11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int ans = 0;
        int area;

        while (left < right) {
            area = (right - left) * Math.min(height[left], height[right]);
            ans = Math.max(ans, area);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode11 leetCode11 = new LeetCode11();
        System.out.println(leetCode11.maxArea(new int[]{10,14,10,4,10,2,6,1,6,12}));
    }
}
