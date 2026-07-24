class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        // HashMap<Character, Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<k;i++){
            // map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            char ch = s.charAt(i);
            if(ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a'){
                count++;
            }
        }
        int max = count;
        for(int j=k;j<s.length();j++){
            char ch1 = s.charAt(j);
            if(ch1 == 'e' || ch1 == 'u' || ch1 == 'i' || ch1 == 'o' || ch1 == 'a'){
                count++;
            }
            char ch2 = s.charAt(l);
            if(ch2 == 'e' || ch2 == 'u' || ch2 == 'i' || ch2 == 'o' || ch2 == 'a'){
                count--;
            }
            l++;
            max = Math.max(max,count);
        }
        return max;
    }
}