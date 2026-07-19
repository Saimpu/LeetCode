class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = 0;
        int j = 0;
        String s1 = "";
        String s2 = "";

        while (i < s.length() || j < t.length()) {

            if (i < s.length() && s.charAt(i) != '#') {
                s1 += s.charAt(i);
                i++;
            } else if (i < s.length()) {
                if (s1.length() > 0) {
                    s1 = s1.substring(0, s1.length() - 1);
                }
                i++;
            }

            if (j < t.length() && t.charAt(j) != '#') {
                s2 += t.charAt(j);
                j++;
            } else if (j < t.length()) {
                if (s2.length() > 0) {
                    s2 = s2.substring(0, s2.length() - 1);
                }
                j++;
            }
        }

        return s1.equals(s2);
    }
}