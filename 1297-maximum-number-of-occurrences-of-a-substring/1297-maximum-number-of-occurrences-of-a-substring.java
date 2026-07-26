class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        HashMap<String, Integer> map = new HashMap<>();
        int[] freq = new int[26];

        int left = 0;
        int unique = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {


            if (freq[s.charAt(right) - 'a'] == 0) {
                unique++;
            }
            freq[s.charAt(right) - 'a']++;


            if (right - left + 1 > minSize) {
                freq[s.charAt(left) - 'a']--;
                if (freq[s.charAt(left) - 'a'] == 0) {
                    unique--;
                }
                left++;
            }

            if (right - left + 1 == minSize && unique <= maxLetters) {
                String sub = s.substring(left, right + 1);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                ans = Math.max(ans, map.get(sub));
            }
        }

        return ans;
    }
}