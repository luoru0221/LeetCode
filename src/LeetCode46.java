import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        ans.add(list);

        int[] temp = nums.clone();
        while(true){
            nextPermutation(temp);
            if(Arrays.equals(temp,nums)){
                break;
            }
            ans.add(Arrays.stream(temp).boxed().collect(Collectors.toList()));
        }
        return ans;
    }

    public void nextPermutation(int[] nums) {
        int right = nums.length - 1;
        int left = nums.length - 1;

        while (left > 0 && nums[left] < nums[left - 1]) {
            left--;
        }
        left--;
        if (left == -1) {
            Arrays.sort(nums);
        } else {
            //找到第一个比nums[left]大的元素
            while (nums[right] <= nums[left]) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            Arrays.sort(nums, left + 1, nums.length);
        }
    }

}
