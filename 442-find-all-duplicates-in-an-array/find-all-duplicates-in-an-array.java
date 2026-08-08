class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> l = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];
        for(int i = 0;i<nums.length;i++){
            int index = nums[i];
            if(arr[index - 1] == true){
                l.add(nums[i]);
            }
            arr[index - 1] = true;
        }
        return l;
    }
}