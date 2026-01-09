class Solution {
    public boolean checkPerfectNumber(int num) {
        int o = num;
        int d1 = 0;
        for(int i = 1;i<o;i++){
            if(o % i == 0){
                d1 = d1 + i;
            }
        }
        if(d1==num){
            return true;
        }
        else{
            return false;
        }
    }
}