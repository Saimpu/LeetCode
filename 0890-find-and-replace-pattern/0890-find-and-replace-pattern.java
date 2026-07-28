class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> li = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            boolean count = true;
            String s = words[i];
            HashMap<Character , Character> map1 = new HashMap<>();
            HashMap<Character , Character> map2 = new HashMap<>();
            for(int j=0;j<pattern.length();j++){
                char ch1 = pattern.charAt(j);
                char ch2 = s.charAt(j);
                if(map1.containsKey(ch1)){
                    if(map1.get(ch1) != ch2){
                        count = false;
                        break;
                    }
                }else{
                    map1.put(ch1,ch2);
                    // count++;
                }

                if(map2.containsKey(ch2)){
                    if(map2.get(ch2) != ch1){
                        count = false;
                        break;
                    }
                }else{
                    map2.put(ch2,ch1);
                    // count++;
                }
            }
            if(count){
                li.add(s);
            }
        }
        return li;
    }
}