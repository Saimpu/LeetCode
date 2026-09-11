class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<String> stc = new Stack<>(); 
        int num = 0;
        String str = "";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + ch - '0';
            }
            if(Character.isLetter(ch)){
                str+=ch;
            }
            if(ch =='['){
                st.push(num);
                stc.push(str);
                str = "";
                num=0;
            }
            if(ch == ']'){
                int n = st.pop();
                String prev = stc.pop();
                while(n-->0){
                    prev+=str;
                }
                str = prev;
            }
        }
        return str;
    }
}