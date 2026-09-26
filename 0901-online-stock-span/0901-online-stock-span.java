class StockSpanner {
    Stack<Integer> st ;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int count = 0;
        for(int i = st.size()-1;i>=0;i--){
            if(price >= st.get(i)){
                count++;
            }else{
                break;
            }
        }
        st.push(price);
        return count+1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */