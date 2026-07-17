class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        s = s.toLowerCase();
        char S[] = s.toCharArray();
        while(i<j){
            if(!Character.isLetterOrDigit(S[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(S[j])){
                j--;
                continue;
            }

            if(S[i] != S[j]){
                return false;
            }
             i++;
             j--;
        }
        return true;
    }
}