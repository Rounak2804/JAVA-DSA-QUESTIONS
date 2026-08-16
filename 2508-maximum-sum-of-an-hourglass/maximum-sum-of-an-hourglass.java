class Solution {
    public int maxSum(int[][] mat) {

        int max = -1;

        for (int i = 0; i < mat.length - 2; i++) {
            for (int j = 0; j < mat[0].length - 2; j++) {

                int sum = 0;

                
                sum += mat[i][j];
                sum += mat[i][j + 1];
                sum += mat[i][j + 2];

                
                sum += mat[i + 1][j + 1];

                sum += mat[i + 2][j];
                sum += mat[i + 2][j + 1];
                sum += mat[i + 2][j + 2];

                max = Math.max(max, sum);
            }
        }
        return max;
    }
}