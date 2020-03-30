import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            List<Integer> pre = null;
            if (i > 0) {
                pre = ans.get(i - 1);
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    tmp.add(1);
                } else {
                    assert pre != null;
                    tmp.add(pre.get(j - 1) + pre.get(j));
                }
            }
            ans.add(tmp);
        }
        return ans;
    }
}
