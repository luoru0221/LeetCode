import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int line = matrix.length; //矩阵的行数
        if (line == 0) {
            return ans;
        }
        int row = matrix[0].length;  //矩阵的列数

        //记录矩阵四条边的位置
        int up = 0;
        int down = line - 1;
        int left = 0;
        int right = row - 1;

        while (true) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[up][i]);
            }
            if (++up > down) {
                break;
            }

            for (int i = up; i <= down; i++) {
                ans.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }

            for (int i = right; i >= left; i--) {
                ans.add(matrix[down][i]);
            }
            if (--down < up) {
                break;
            }

            for (int i = down; i >= up; i--) {
                ans.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return ans;
    }

}
