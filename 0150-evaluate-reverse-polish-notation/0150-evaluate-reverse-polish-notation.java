class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(String ch : t){
            if(!ch.equals("+") && !ch.equals("*") && !ch.equals("-") && !ch.equals("/") ){
                st.push(Integer.parseInt(ch));
            }else{
                int num2 = st.pop();
                int num1 = st.pop();
                if(ch.equals("*")){
                    ans += num1*num2;
                }else if(ch.equals("-")){
                    ans += num1 - num2;
                }else if(ch.equals("+")){
                    ans  += num1+num2;
                }else {
                    ans += num1/num2;
                }
                st.push(ans);
                ans = 0;
            }
        }
        return st.pop();
    }
}