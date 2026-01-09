class Solution {
    public boolean isSameAfterReversals(int num) {
        int o = num;
        int r1 = 0;
        while(o != 0){
            int l = o % 10;
            r1 = r1 * 10 + l;
            o /= 10;
        }
        int r2 = 0;
        int o1 = r1;
        while(o1 != 0){
            int l2 = o1 % 10;
            r2 = r2 * 10+l2;
            o1 /= 10;
        }
        if(r2==num){
            return true;
        }
        else{
            return false;
        }

    }
}