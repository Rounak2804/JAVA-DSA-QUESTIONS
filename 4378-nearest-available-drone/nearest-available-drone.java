class Solution {
    public int nearestDrone(int[][] nums, int[] target) {
        
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 0;i<nums.length;i++){
            int d = Math.abs(nums[i][0] - target[0]) + Math.abs(nums[i][1] - target[1]);

            if(d <= nums[i][2] && d < min){
                min = d;
                idx = i;
            }
        }

return idx;
    }
}