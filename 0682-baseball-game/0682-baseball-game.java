class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String s : operations){
            if(!s.equals("+") && !s.equals("C") && !s.equals("D")){
                st.push(Integer.parseInt(s));
            }else if(s.equals("C")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(s.equals("D")){
                int num1 =st.pop();
                st.push(num1);
                st.push(num1 * 2);
            }else if(s.equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2);
                st.push(num1);
                st.push(num1+num2);

            }
        }
        System.out.println(st);
        int result = 0;
        while(!st.isEmpty()){
            result+=st.pop();
        }
        return result;
    }
}