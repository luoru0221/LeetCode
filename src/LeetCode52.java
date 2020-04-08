public class LeetCode52 {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int temp = nums[0];
        int maxSubSum = nums[0];

        for(int i=1;i<len;i++){
            if(temp>0){
                temp+=nums[i];
            }else{
                temp = nums[i];
            }

            if(temp>maxSubSum){
                maxSubSum = temp;
            }
        }
        return maxSubSum;
    }
}
