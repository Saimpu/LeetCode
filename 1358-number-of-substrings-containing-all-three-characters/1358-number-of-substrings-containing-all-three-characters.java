import java.util.HashMap;

class Solution {
    public int numberOfSubstrings(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int ans = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.getOrDefault('a', 0) > 0 &&
                   map.getOrDefault('b', 0) > 0 &&
                   map.getOrDefault('c', 0) > 0) {

                ans += n - right;

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                left++;
            }
        }

        return ans;
    }
}