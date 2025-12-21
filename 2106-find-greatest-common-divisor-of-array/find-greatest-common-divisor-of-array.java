import java.util.Arrays;
class Solution {
    public int findGCD(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int small = arr[0];
        int largest = arr[n-1];
        int gcd = 1;   
        for(int i = 1;i<=largest;i++){
        if(small%i==0 && largest%i==0){
            gcd = i;
        }
        }
        return gcd;
    }
}