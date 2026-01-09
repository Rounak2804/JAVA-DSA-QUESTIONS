class Solution {
    public int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int curr = arr[i];
            int cnt = 0;
            while (curr != 0) {
              
                cnt++;
                curr /= 10;
            }
            if (cnt % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}