class Solution {
    public int differenceOfSum(int[] arr) {
        int ele = 0;
        int digit = 0;
        for(int i = 0;i<arr.length;i++){
            ele = ele + arr[i];
            if(arr[i]<=9 || arr[i]>=10){
                if(arr[i]>=10){
                    while(arr[i] != 0){
                        int last = arr[i] % 10;
                        digit = digit + last;
                        arr[i] = arr[i] / 10;
                    }
                }
                else{
                    digit = digit+arr[i];
                }
            }
        }
        return ele - digit;

    }
}