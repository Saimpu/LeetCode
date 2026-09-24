class CustomStack {
    int[] arr;
    int[] stack;
    int top;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        stack = new int[maxSize];
        top=-1;
    }
    
    public void push(int x) {
        if(top<stack.length-1){
            top++;
            stack[top] = x;
        }
    }
    
    public int pop() {
        if(top ==-1){
            return -1;
        }
        int result = stack[top] + arr[top];
        if (top > 0) {
                arr[top - 1] += arr[top];
        }
        arr[top] = 0;       
        top--;
        return result;
    }
    
    public void increment(int k, int val) {
        if(top>=0){
            int limit = Math.min(top,k-1);
            arr[limit] += val; 
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */