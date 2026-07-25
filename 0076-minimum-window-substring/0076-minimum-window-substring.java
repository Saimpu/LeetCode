class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
            count++;
        }
        int i=0;
        int start = 0;

        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))>=0){
                    count--;
                }
            }
            while(count == 0){
                if(j-i+1<minLen){
                    minLen = j-i+1;
                    start = i;
                }

                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i)) > 0){
                        count ++;
                    }
                }
                i++;
            }
        }
        return minLen == Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}