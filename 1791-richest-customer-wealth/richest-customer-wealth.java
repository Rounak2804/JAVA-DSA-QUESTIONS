class Solution {
    public int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
      
        for (int i = 0; i < arr.length; i++) {
               int result = 0;
            for (int j = 0; j < arr[i].length; j++) {
                result = result + arr[i][j];
            }

            if (max < result) {
                max = result;
            }

        }
        return max;

    }
}