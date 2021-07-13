class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i), b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b) return false; 
            }
            else if(map.containsValue(b)) return false;
            else map.put(a, b);
        }
        return true;
    }
}