class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = -1;
        int c = 0; // 1

        for(int i = 0;i<nums.length;i++){

            if(nums[i] == 1){
                c++;
            }

            else {
                // find the max
                max = Math.max(max , c);
                c = 0;
            }

        }
        max = Math.max(c , max);
        return max;
    }
}