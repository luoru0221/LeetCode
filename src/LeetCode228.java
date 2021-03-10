import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {

    public List<String> summaryRanges(int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length;
        List<String> ans = new ArrayList<>();
        if(len==0){
            return ans;
        }
        while (right < len) {
            if (right == len - 1) {
                break;
            } else {
                if (nums[right] != nums[right + 1] - 1) {
                    if (left == right) {
                        ans.add(nums[left] + "");
                    } else {
                        ans.add(nums[left] + "->" + nums[right]);
                    }
                    left = right + 1;
                }
                right++;
            }
        }

        if (left == right) {
            ans.add(nums[left] + "");
        } else {
            ans.add(nums[left] + "->" + nums[right]);
        }

        return ans;
    }
}
