class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> l = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];
        for(int i = 0;i<nums.length;i++){
            int index = nums[i];
            arr[index - 1] = true;
        }   

        for(int i = 0;i<arr.length;i++){
            if(!arr[i]){
                l.add(i+1);
            }
        }
        return l;
    }
}