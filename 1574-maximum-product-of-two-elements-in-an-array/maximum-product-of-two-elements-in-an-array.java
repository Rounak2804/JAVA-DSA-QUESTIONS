class Solution {
    public int maxProduct(int[] arr) {
       int max1 = 0;
        int max2 = 0;

        if(arr[1]>=arr[0]){
            max1 = arr[1];
            max2 = arr[0];
        }                                                                               
        else if(arr[0]>=arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else{
            max1 = arr[0];
            max2 = arr[1];
        }

        for(int i = 2;i<arr.length;i++){
            if(arr[i]>=max1){
                max2 = max1;                          
                max1 = arr[i];
            }
            else if(arr[i]>=max2){
                max2 = arr[i];
            }
        }
            int x = (max1-1)*(max2-1);
            return x;
    }
}