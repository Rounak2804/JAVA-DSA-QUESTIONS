
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i = 0;i<apple.length;i++){
            sum = sum+apple[i];
        }
        int count = 0;
        Arrays.sort(capacity);
        int n = capacity.length-1;
        int left = sum;
        for(int i = n;i>=0;i--){
            if(left>capacity[i]){
                left = left - capacity[i];
                count++;
                
            }
            else{
                count++;
                break;
            }
        }
return count;
    }
}