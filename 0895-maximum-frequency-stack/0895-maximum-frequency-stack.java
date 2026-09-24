class FreqStack {
    HashMap<Integer,Integer> freq;
    HashMap<Integer,Stack<Integer>> group;
    int maxFreq;
    public FreqStack() {
        freq = new HashMap<>(); 
        group = new HashMap<>();
    }
    
    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);
        group.putIfAbsent(f, new Stack<>());
        group.get(f).push(val);
        maxFreq = Math.max(maxFreq, f);
    }
    
    public int pop() {
        Stack<Integer> st = group.get(maxFreq);
        int val = st.pop();
        int f = freq.get(val) - 1;
        freq.put(val, f);
        if (st.isEmpty()) {
            maxFreq--;
        }

        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */