class RecentCounter {
    Queue<Integer> q ;
    public RecentCounter() {
        q = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        int c = 0;
        q.offer(t);
        for(int num : q){
            if(num>=(t-3000) && num<=t){
                c++;
            }
        }
        return c;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */