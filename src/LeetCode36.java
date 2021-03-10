import java.util.HashSet;

public class LeetCode36 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> exist = new HashSet<>();

        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9' && (!exist.add("(" + i + ")" + board[i][j]) ||
                        !exist.add(board[i][j] + "(" + j + ")") || !exist.add("(" + i / 3 + ")" + board[i][j] + "(" + j / 3 + ")"))) {
                    return false;
                }
            }
        }
        return true;
    }
}
