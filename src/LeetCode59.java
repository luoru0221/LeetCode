public class LeetCode59 {

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0;
        int down = n-1;
        int left = 0;
        int right = n-1;

        int count = 1;
        while (true) {

            for (int i = left; i <= right; i++) {
                ans[top][i] = count++;
            }
            top++;
            if(count>n*n){
                break;
            }

            for(int i=top;i<=down;i++){
                ans[i][right] = count++;
            }
            right--;
            if(count>n*n){
                break;
            }

            for(int i=right;i>=left;i--){
                ans[down][i] = count++;
            }
            down--;
            if(count>n*n){
                break;
            }

            for(int i=down;i>=top;i--){
                ans[i][left] = count++;
            }
            left++;
            if(count>n*n){
                break;
            }
        }
        return ans;
    }
}
