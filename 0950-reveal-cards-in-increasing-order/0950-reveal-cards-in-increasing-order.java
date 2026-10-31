class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new ArrayDeque<>();
        Arrays.sort(deck);
        for(int i = 0;i<deck.length;i++){
            
            q.offer(i);
        }
        int[] ans = new int[deck.length];
        for(int i = 0;i<deck.length;i++){
            int id = q.poll();
            ans[id] = deck[i];
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return ans;
    }
}