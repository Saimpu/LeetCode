class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else {
                if(i+1<s.length() && s.charAt(i+1) == ')'){
                    i++;
                    if(!st.isEmpty()){
                        st.pop();
                    }else{
                        ans++;
                    }
                }else{
                    if(!st.isEmpty()){
                        st.pop();
                        ans++;
                    }else{
                        ans+=2;
                    }
                }
            }
        }
        return ans+2*st.size();
    }
}