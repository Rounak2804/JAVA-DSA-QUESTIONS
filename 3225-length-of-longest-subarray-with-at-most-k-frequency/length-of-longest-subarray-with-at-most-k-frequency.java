class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        int i = 0;
        int j = 0;
        int d = Integer.MIN_VALUE;
        Map<Integer , Integer> map = new HashMap<>();
       while(i<nums.length && j < nums.length){
            int x = nums[j];
            if(!map.containsKey(x)){
                map.put(x , 1);
                d = Math.max((j - i)+1 , d);
                j++;
                continue;
            }

            if(map.containsKey(x)){
                // 2 case bnege that we have it that point of k and we dont have hit that 
                 map.put(x , map.get(x) + 1);

                // shrink window if limit exceeded
                while(map.get(x) > k){

                    map.put(nums[i], map.get(nums[i]) - 1);

                    i++;
                }

                d = Math.max((j - i) + 1 , d);

                j++;
            }



       }
    return d;

    }
}