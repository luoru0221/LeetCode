public class LeetCode27 {
	public int removeElement(int[] nums, int val) {
		int sum = nums.length;
		for (int i = 0; i < sum; i++) {
			if (nums[i] == val) {
				sum--;
				for (int j = i; j < sum; j++)
					nums[j] = nums[j + 1];
				i--;
			}
		}
		return sum;
	}
}
