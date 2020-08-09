public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length; //矩阵行数
        int column = matrix[0].length;  //矩阵列数
        int left = 0;
        int right = row * column;
        int mid;
        int rowIndex;
        int columnIndex;

        //二分查找目标值
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            rowIndex = mid / column; //mid值行位置
            columnIndex = mid % column; //mid值列位置

            if (matrix[rowIndex][columnIndex] == target) {
                return true;
            } else if (matrix[rowIndex][columnIndex] < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
