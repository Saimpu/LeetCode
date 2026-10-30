class MyCircularQueue {
    int[] a;
    int r,f,size,count; 
    public MyCircularQueue(int k) {
        a = new int[k];
        f = 0;
        r = k-1;
        size = k;
        count = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        r = (r+1)%size;
        a[r] =value;
        count++;
        return true; 
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        f = (f+1)%size;
        count-- ;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return a[f];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return a[r];
    }
    
    public boolean isEmpty() {
        if(count == 0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(count == size){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */