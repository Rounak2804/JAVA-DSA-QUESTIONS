class Solution {
    public int mirrorDistance(int n) {
        int r = 0;
        int o = n;
        while(o!=0){
            int last = o % 10;
            r = r * 10 + last;
            o /= 10;
        }
       return Math.abs(n - r);
    }
}