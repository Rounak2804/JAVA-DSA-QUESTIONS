class Solution {
public:
    int majorityElement(vector<int>& nums) {
        for(int i=0; i<nums.size(); i++){
            int target = nums[i],count = 0;
            for(int j=i; j<nums.size(); j++){
                if(nums[j]==target){
                    count++;
                }

            }
            if(count>nums.size()/2){
            return  target;
            }
        }
        return -1;
        
    }
};