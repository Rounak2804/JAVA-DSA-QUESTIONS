
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i = 0;i<apple.length;i++){
            sum = sum+apple[i];
        }
        int count = 0;
        Arrays.sort(capacity);
        int n = capacity.length-1;
        
        for(int i = n;i>=0;i--){
            if(sum>capacity[i]){
                sum = sum - capacity[i];
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