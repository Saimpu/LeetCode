class Solution {
    public String reverseWords(String s) {
        String S[] = s.trim().split("\\s+");
        int i=0;
        int j=S.length-1;
        while(i<j){
            String temp = S[i];
            S[i] = S[j];
            S[j] = temp;
            i++;
            j--;
        }
        return String.join(" ",S);
    }
}