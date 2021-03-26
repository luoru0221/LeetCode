import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        changeFromBegin(nums, 0, ans);
        return ans;
    }

    /**
     * 对数组nums从begin位置开始全排列
     *
     * @param nums  数组
     * @param begin 全排列开始的位置
     * @param ans   结果
     */
    public void changeFromBegin(int[] nums, int begin, List<List<Integer>> ans) {
        if (begin == nums.length) {
            //开始变化的位置为数组长度，即数组前面的数字都不变,直接加入道数组中
            List<Integer> piece = new ArrayList<>();
            for (int num : nums) {
                piece.add(num);
            }
            ans.add(piece);
        } else {
            for (int i = begin; i < nums.length; i++) {
                //将每个数字放到begin位置一次
                swap(nums, begin, i);
                //变化begin后面的数字
                changeFromBegin(nums, begin + 1, ans);
                //将数组还原，避免对后续操作影响结果
                swap(nums, begin, i);
            }
        }
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }


}
