class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(0);
            }else{
                    int curr = st.pop();
                    int score ;
                    if(curr == 0){
                        score =1;
                    }else{
                        score = 2*curr;
                    }

                    if (!st.isEmpty()) {
                        st.push(st.pop() + score);
                    } else {
                        st.push(score);
                    }
            }
        }
        return st.peek();
    }
}