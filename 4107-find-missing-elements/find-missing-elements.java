class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        // int l = nums[0];
        // int s = Integer.MAX_VALUE;

        // for(int x : nums){
        //     if(x > l){
        //         l = x;
        //     }
        //     else if(x < s){
        //         s = x;
        //     }
        // }



        ArrayList<Integer> main = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        Arrays.sort(nums);
        int n = nums.length - 1;
        for(int i = nums[0];i<nums[n];i++){
            if(!set.contains(i)) main.add(i);
        }
        return main;
    }
}