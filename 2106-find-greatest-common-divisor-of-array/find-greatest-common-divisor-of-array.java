import java.util.HashMap;

class Solution {
    public int findGCD(int[] nums) {

        // Step 1: Put array elements into HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Find min and max keys
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int key : map.keySet()) {
            min = Math.min(min, key);
            max = Math.max(max, key);
        }

        // Step 3: Return GCD of min and max
        return gcd(min, max);
    }

    // Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
