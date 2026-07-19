class Solution {
    public String reverseWords(String s) {
        String S[] = s.split(" ");
        for(int l=0;l<S.length;l++){
            char str[] =S[l].toCharArray();
            int i=0;
            int  j=str.length-1;
            while(i<=j){
                char temp =str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            S[l]=new String(str);
        }
        return String.join(" ",S);
    }
}