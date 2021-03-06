public class 面试题47礼物的最大价值 {

    public int maxValue(int[][] grid) {
        int lineLen = grid.length;
        int rowLen = grid[0].length;

        for (int i = 1; i < lineLen; i++) {
            grid[i][0] = grid[i][0] + grid[i - 1][0];
        }
        for (int i = 1; i < rowLen; i++) {
            grid[0][i] = grid[0][i] + grid[0][i - 1];
        }
        for (int i = 1; i < lineLen; i++) {
            for (int j = 1; j < rowLen; j++) {
                grid[i][j] = grid[i][j] + Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[lineLen - 1][rowLen - 1];
    }

}
