class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int res[] = new int[n];                                    
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            res[i] = sum;
            
        }
        return res;
    }
}