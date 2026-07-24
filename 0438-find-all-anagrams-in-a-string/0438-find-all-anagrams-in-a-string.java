class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int start=0;
        List<Integer> li = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
            count++;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))>=0){
                    count--;
                }
            }
            while(count==0){
               if (i - j + 1 == p.length()) {
                    li.add(j);
                }
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), map.get(s.charAt(j))+1);
                    if(map.get(s.charAt(j))>0){
                        count++;
                    }
                }
                j++;
            }
        }
        return li;
    }
}