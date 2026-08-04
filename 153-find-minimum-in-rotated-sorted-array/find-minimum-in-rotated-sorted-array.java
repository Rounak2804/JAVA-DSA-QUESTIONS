class Solution {
    public int findMin(int[] arr) {
        // find pivot : get index of pivot thats the answer
        // small : arr[i-1] > arr[i] < arr[i+1]
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;
            if (arr[mid] < arr[r]) {
                r = mid;
                // minimum will be behind the mid
            } else if (arr[mid] > arr[r]) {
                l = mid + 1;
                // min will be forward to mid
            }
        }
        return arr[r];

    }
}