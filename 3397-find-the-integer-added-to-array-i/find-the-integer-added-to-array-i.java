class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int largest = -1;
        int largest2 = -1;
        for(int i = 0;i<nums1.length;i++){
            if(nums1[i]>largest){
                largest = nums1[i];
            }
        }
            for(int j = 0;j<nums2.length;j++){
            if(nums2[j]>largest2){
                largest2 = nums2[j];
            }
            }
            int x = largest2 - largest;
            return x;

        
    }
}