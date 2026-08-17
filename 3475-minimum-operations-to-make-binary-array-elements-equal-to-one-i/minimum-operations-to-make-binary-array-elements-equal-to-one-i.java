class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i = 2;i<nums.length;i++){
            if (nums[i - 2] == 0) {
                count++;
                nums[i - 2] = nums[i - 2] ^ 1;
                nums[i - 1] = nums[i - 1] ^ 1;
                nums[i] = nums[i] ^ 1;
            }
        }
        int s = 0;
        for(int x : nums) {
            s += x;
        }

        if(s == nums.length) return count;
        else return -1; 
    }
}