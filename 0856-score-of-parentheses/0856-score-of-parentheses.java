class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(0);
            } 
            else {
                int current = st.pop();

                int score;

                if (current == 0) {
                    score = 1;
                } else {
                    score = 2 * current;
                }

                int parent = st.pop();
                parent += score;
                st.push(parent);
            }
        }
        return st.peek();
    }
}