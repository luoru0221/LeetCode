import java.util.Comparator;
import java.util.LinkedList;

public class LeetCode56 {

    class Interval {
        int left;
        int right;

        Interval(int left, int right) {
            this.left = left;
            this.right = right;
        }

    }

    public int[][] merge(int[][] intervals) {
        LinkedList<Interval> intervalList = new LinkedList<>();
        LinkedList<Interval> mergedInterval = new LinkedList<>();
        for (int[] item : intervals) {
            intervalList.add(new Interval(item[0], item[1]));
        }

        //区间按照左边界排序
        intervalList.sort(Comparator.comparingInt(interval -> interval.left));
        int len = intervalList.size();
        mergedInterval.add(0, intervalList.get(0));
        int addNum = 1;

        for (int i = 1; i < len; i++) {
            Interval interval = intervalList.get(i);

            if (interval.left > mergedInterval.get(addNum - 1).right) {
                mergedInterval.add(addNum++, interval);
            } else {
                if (interval.right > mergedInterval.get(addNum - 1).right) {
                    mergedInterval.get(addNum - 1).right = interval.right;
                }
            }
        }

        int size = mergedInterval.size();
        int[][] ans = new int[size][2];
        for (int i = 0; i < size; i++) {
            ans[i][0] = mergedInterval.get(i).left;
            ans[i][1] = mergedInterval.get(i).right;
        }

        return ans;
    }
}
