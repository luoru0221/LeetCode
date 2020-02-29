import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode73 {

    public void setZeroes(int[][] matrix) {

        LinkedList<Integer> allLine = new LinkedList<>();
        LinkedList<Integer> allRow = new LinkedList<>();

        int line = matrix.length;
        for (int i = 0; i < line; i++) {
            int row = matrix[i].length;
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == 0) {
                    allLine.add(i);
                    allRow.add(j);
                }
            }
        }

        for (Integer integer : allLine) {
            Arrays.fill(matrix[integer],0);
        }

        for (Integer integer : allRow) {
            setZerosUtil(matrix,integer);
        }
    }

    public static void setZerosUtil(int[][] matrix, int y) {
        //第y列置为0
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][y] = 0;
        }
    }
}
