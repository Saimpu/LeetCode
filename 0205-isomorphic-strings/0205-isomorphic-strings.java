class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                map.put(c1, c2);
            }

            if (map1.containsKey(c2)) {
                if (map1.get(c2) != c1)
                    return false;
            } else {
                map1.put(c2, c1);
            }
        }

        return true;
    }
}