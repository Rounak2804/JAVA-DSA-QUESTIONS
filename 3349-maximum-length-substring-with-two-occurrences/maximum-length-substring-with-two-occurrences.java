class Solution {
    public int maximumLengthSubstring(String s) {

        // HashMap<Character , Integer> map = new HashMap<>();
        // for(int i = 0;i<s.length();i++){
        //     map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1);
        // }
        int l = -1;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(s.charAt(i), 1);
            int j = i + 1;
            for (j = i + 1; j < s.length(); j++) {
                char ch = s.charAt(j);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) > 2) {
                    break;
                }

                l = Math.max(l, j - i + 1);
            }

        }
        return l;
    }
}