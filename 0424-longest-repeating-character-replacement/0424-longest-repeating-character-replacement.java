class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int maxFreq = 0;
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((j - i + 1) - maxFreq > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}