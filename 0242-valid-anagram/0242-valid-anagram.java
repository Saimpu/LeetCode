class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] charArray = new int[26];
        for (char c : s.toCharArray()) {
            charArray[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charArray[c - 'a']--;
        }
        for (int i : charArray) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}