class Solution {
    public boolean lemonadeChange(int[] arr) {
        

        int b5 = 0;
        int b10 = 0;
        int b20 = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 5){
                b5++;
            }

            else if(arr[i] == 10){
                if(b5 >= 1){
                    b10++;
                    b5--;
                }
                else return false;
            }
            else if(arr[i] == 20){
                if(b10>=1 && b5>=1){
                    b10--;
                    b5--;
                }
                else if(b5 >= 3) b5-=3;
                else return false;
                
            }

        }

       return true;
    }
}