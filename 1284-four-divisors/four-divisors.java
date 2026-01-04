class Solution {
    public int sumFourDivisors(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int count = 0;
            int psum = 0;
            for (int j = 1; j * j <= curr; j++) {

                if (curr % j == 0) {
                    if (j == curr / j) {

                        psum += j;
                        count += 1;
                    } else {

                        psum += j;
                        psum += curr / j;
                        count += 2;
                    }
                }
            }
            if (count == 4 && count < 5) {
                    sum += psum;
                }
        }
        return sum;
    }
}