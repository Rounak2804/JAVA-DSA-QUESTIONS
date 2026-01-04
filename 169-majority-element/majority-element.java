class Solution {
    public int majorityElement(int[] arr) {
        int count = 1;
        int maj = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(count==0){
                maj = arr[i];
                count = 1;
            }
            else if(maj==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return maj;
    }
}