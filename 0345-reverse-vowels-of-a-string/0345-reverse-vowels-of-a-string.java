class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j = s.length()-1;
        char S[] = s.toCharArray();
        while(i<=j){
            if(isVowel(S[i]) && isVowel(S[j])){
                char temp = S[i];
                S[i] = S[j];
                S[j] = temp;
                i++;
                j--;
            }else if(isVowel(S[i]) && !isVowel(S[j])){
                j--;
            }else if(!isVowel(S[i]) && isVowel(S[j])){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return new String(S);
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}