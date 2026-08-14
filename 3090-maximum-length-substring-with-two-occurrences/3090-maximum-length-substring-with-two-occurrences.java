class Solution {
    public int maximumLengthSubstring(String s) {
        int i =0;
        int max = 0;
        int[] arr = new int[26];
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j);
            arr[ch-'a']++;
            while(arr[ch-'a']>2){
                char ch1 = s.charAt(i);
                arr[ch1-'a']--;
                i++;
            }
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}