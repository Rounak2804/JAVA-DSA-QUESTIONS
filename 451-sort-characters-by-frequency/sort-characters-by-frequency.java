class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        List<Character> l = new ArrayList<>(map.keySet());
        l.sort((ob1 , ob2) -> map.get(ob2) - map.get(ob1));
        for(char ch : l){
            for(int i = 0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}