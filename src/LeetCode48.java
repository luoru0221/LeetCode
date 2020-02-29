public class LeetCode48 {
    public void rotate(int[][] matrix) {
        int line = matrix.length; //矩阵行数
        int tmp;

        //上下交换
        for (int i = 0; i < line/2; i++) {
            for(int j=0;j<line;j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[line-1-i][j];
                matrix[line-1-i][j] = tmp;
            }
        }

        //对角交换
        for(int i=0;i<line-1;i++){
            for(int j=i+1;j<line;j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        LeetCode48 leetCode48 = new LeetCode48();
        leetCode48.rotate(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}