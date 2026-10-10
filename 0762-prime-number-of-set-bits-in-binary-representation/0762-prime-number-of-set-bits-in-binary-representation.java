class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i = left;i<=right;i++){
            int num = countSetBit(i);
            c+=prime(num);
        }
        return c;
    }
    int countSetBit(int i){
        int c = 0;
        while(i>0){
            i = (i&(i-1));
            c++;
        }
        return c;
    }
    int prime(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count!=2){
            return 0;
        }
        return 1;
    }
}