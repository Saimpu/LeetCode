class Solution {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == t.length();
    }
    public String findLongestWord(String s, List<String> dict) {
        int n = dict.size();
        String ans ="";
        // int max = 0;
        for(int i=0;i<n;i++){
            String word = dict.get(i);
            if(isSubsequence(s,word)){
                if (word.length() > ans.length()) {
                    ans = word;
                } else if (word.length() == ans.length()
                        && word.compareTo(ans) < 0) {
                    ans = word;
                }
            }
        }
        return ans;
    }
}