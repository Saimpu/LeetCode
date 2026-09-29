class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            while (k > 0 && !st.isEmpty() && st.peek() > digit) {
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        for (int digit : st) {
            if (ans.length() == 0 && digit == 0) {
                continue; 
            }
            ans.append(digit);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}