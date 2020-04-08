public class LeetCode64 {

    public int minPathSum(int[][] grid) {
        int row = grid.length; //行数
        int column = grid[0].length;  //列数

        for (int i = column - 2; i >= 0; i--) {
            grid[row - 1][i] += grid[row - 1][i + 1];
        }
        for (int i = row - 2; i >= 0; i--) {
            grid[i][column - 1] += grid[i + 1][column - 1];
        }
        for (int i = row - 2; i >= 0; i--) {
            for (int j = column - 2; j >= 0; j--) {
                grid[i][j] += Math.min(grid[i][j + 1], grid[i + 1][j]);
            }
        }
        return grid[0][0];
    }
}
