class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<List<Character>> li = new ArrayList<>();
        char a[] = s.toCharArray();
        Arrays.sort(a);
        String str = new String(a);
        for(int i=0;i<=str.length();i++){
            li.add(null);
        }
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        
        for(char ch : str.toCharArray()){
            int freq = map.get(ch);
            if(li.get(freq) == null){
                li.set(freq,new ArrayList<>());
            }
            li.get(freq).add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = li.size()-1;i>=0;i--){
            if(li.get(i)!=null){
                for(char ch : li.get(i)){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();

    }
}