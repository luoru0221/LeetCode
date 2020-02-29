import java.util.List;

public class LeetCode120 {

    public int minimumTotal(List<List<Integer>> triangle) {

        int high = triangle.size();
        for (int i = high - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {
                int tmp = triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, tmp);
            }
        }
        return triangle.get(0).get(0);
    }

}
