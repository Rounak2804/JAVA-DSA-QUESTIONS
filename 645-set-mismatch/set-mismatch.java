class Solution {
    public int[] findErrorNums(int[] nums) {
        // Arrays.sort(nums);
        int res[] = new int[2];
        boolean arr[] = new boolean[nums.length];

        for (int x : nums) {
            if (arr[x - 1]) {
                res[0] = x; 
            } else {
                arr[x - 1] = true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                res[1] = i + 1;
                
            }
        }
        return res;
    }
}