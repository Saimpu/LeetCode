class Solution {
    public String predictPartyVictory(String senate) {
        char[] str = senate.toCharArray();
        Queue<Integer> r = new ArrayDeque<>();
        Queue<Integer> d = new ArrayDeque<>();
        for(int i = 0;i<str.length;i++){
            char ch = str[i];
            if(ch == 'R'){
                r.offer(i);
            }
            if(ch == 'D'){
                d.offer(i);
            }
        }
        int n = senate.length();
        while(!r.isEmpty() && !d.isEmpty()){
            int ra = r.poll();
            int di = d.poll();
            if(ra<di){
                r.offer(ra+n);
            }else{
                d.offer(di+n);
            }
        }
        return r.isEmpty()?"Dire":"Radiant";
    } 
}