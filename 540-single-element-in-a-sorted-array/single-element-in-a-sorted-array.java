class Solution {
    public int singleNonDuplicate(int[] arr) {
         Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            count = count ^ arr[i];
        }
        return count;
      
    }
}