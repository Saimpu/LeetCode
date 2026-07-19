class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int c=0;c<s.length();c++){
            if(s.charAt(c)=='#'){
                if(s1.length()>0) s1.deleteCharAt(s1.length()-1);
            } 
            else s1.append(s.charAt(c));
        }

        for(int c=0;c<t.length();c++){
            if(t.charAt(c)=='#'){
                if(s2.length()>0) s2.deleteCharAt(s2.length()-1);
            }
            else s2.append(t.charAt(c));
        }

        return s1.toString().equals(s2.toString());
    }
}