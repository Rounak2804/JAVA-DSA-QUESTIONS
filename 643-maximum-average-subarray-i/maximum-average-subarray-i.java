class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        
        double max = Integer.MIN_VALUE;
        int j = 0;
        double sum = 0;
        for(j = 0;j<k;j++){
            sum += nums[j];
        }
        max = Math.max(sum , max);
        int i = 0;
        while(j < nums.length){
            sum += nums[j];
            sum -= nums[i];
            max = Math.max(sum , max);
            i++;
            j++;
        }
        return max/k;
    }
}