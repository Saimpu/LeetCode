class Solution {
    public String customSortString(String order, String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();


        for (char ch : order.toCharArray()) {
            while (map.getOrDefault(ch, 0) > 0) {
                ans.append(ch);
                map.put(ch, map.get(ch) - 1);
            }
        }

    
        for (char ch : s.toCharArray()) {
            while (map.getOrDefault(ch, 0) > 0) {
                ans.append(ch);
                map.put(ch, map.get(ch) - 1);
            }
        }

        return ans.toString();
    }
}