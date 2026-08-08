class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int res[] = new int[2];
        boolean arr[] = new boolean[nums.length];
        for(int i = 0;i<nums.length;i++){
            int index = nums[i];
            if(arr[index - 1] == true){
                res[0] =  nums[i];
            }
            arr[index - 1] = true;
        }
        for(int i = 0;i<arr.length;i++){
            if(!arr[i]){
                res[1] = i + 1;
            }
        }
        return res;
    }
}