class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(nums[0]);
        l2.add(nums[1]);

        for(int i = 2;i<nums.length;i++){
            int n = l1.size() - 1;
            int m = l2.size() - 1;
            if(l1.get(n) > l2.get(m)){
                l1.add(nums[i]);
            }
            else l2.add(nums[i]);
        }
        int res[] = new int[nums.length];
        int c = 0;
        for(int i = 0;i < l1.size();i++){
            res[i] = l1.get(i);
            c++;
        }
        
        for(int i = 0;i<l2.size();i++){
            res[c] = l2.get(i);
            c++;
        }

        return res;

    }
}