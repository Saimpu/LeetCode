class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int max = 0;
        for(int j = 0;j<s.length();j++){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char r = s.charAt(i);
                if(map.get(r) == 1){
                    map.remove(r);
                }else{
                    map.put(r,map.get(r)-1);
                }
                i++;
            }
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}