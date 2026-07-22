class Solution {
    static char transform(char ch) {
        return ch == 'z' ? 'a' : (char)(ch + 1);
    }
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j) || transform(str1.charAt(i)) == str2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j==str2.length()){
            return true;
        }
        return false;
    }
}