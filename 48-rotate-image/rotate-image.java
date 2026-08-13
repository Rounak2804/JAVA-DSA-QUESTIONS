class Solution {
    public void rotate(int[][] mat) {
        
        // 1   - >   1 4 7 
        // 4
        // 7 
        int n = mat.length;
        int m = mat[0].length;
    int arr[][] = new int[n][m];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                arr[j][i] = mat[i][j];
            }
        }

        int k = 0; // rows
        for(int i = 0;i<arr.length;i++){
            int l = 0; // col
            for(int j = mat[i].length - 1;j>=0;j--){
                if(l < mat[i].length){
                    mat[k][l] = arr[i][j];
                }
                l++;
            }
            k++;
        }
        // for(int i = 0;i<mat.length;i++){
        //     for(int j = 0;j<mat[i].length;j++){
        //         mat[i][j] = arr[i][j];
        //     }
        // }

    }
}