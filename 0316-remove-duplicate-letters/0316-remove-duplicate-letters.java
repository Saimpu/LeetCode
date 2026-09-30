class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] used = new boolean[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            freq[idx]--;
            if (used[idx]) {
                continue;
            }
            while (!st.isEmpty() && st.peek() > c && freq[st.peek() - 'a'] > 0) {
                used[st.pop() - 'a'] = false;
            }

            st.push(c);
            used[idx] = true;
        }
        String str = "";
        for(int i = 0;i<st.size();i++){
            str+=st.get(i);
        }
        return str;
    }
}