class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0;
        int count=0;
        int max =0;
        for(int j=0;j<s.length();j++){
            count+=Math.abs(s.charAt(j)-t.charAt(j));
            while(count>maxCost){
                count-=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}