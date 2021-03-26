/**
 * @author RuL
 */
public class LeetCode200 {

    int line;
    int column;

    int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int numIslands(char[][] grid) {
        int ans = 0;
        line = grid.length;
        column = grid[0].length;

        boolean[][] visit = new boolean[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1' && !visit[i][j]) {
                    sign(grid, visit, i, j);
                    ans++;
                }
            }
        }

        return ans;
    }

    public void sign(char[][] grid, boolean[][] visit, int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int dx = x + direction[i][0];
            int dy = y + direction[i][1];

            if (dx >= 0 && dx < line && dy >= 0 && dy < column
                    && grid[dx][dy] == '1' && !visit[dx][dy]) {
                sign(grid, visit, dx, dy);
            }
        }
    }
}
