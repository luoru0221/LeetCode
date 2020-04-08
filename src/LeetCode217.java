import java.util.HashSet;

public class LeetCode217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean success = set.add(num);
            if(!success){
                return true;
            }
        }
        return false;
    }
}
