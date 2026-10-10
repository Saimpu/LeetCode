class Solution {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        for(int i = 0;i<31;i++){
            if(getKB(start,i)!=getKB(goal,i)){
                c++;
            }
        }
        return c;
    }
    int getKB(int n,int k){
        return (n&(1<<k));
    }
}