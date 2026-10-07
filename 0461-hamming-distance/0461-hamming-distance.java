class Solution {
    public int hammingDistance(int x, int y) {
        int c= 0 ;
        for(int i = 0;i<31;i++){
            if(getKB(x,i) != getKB(y,i)){
                c++;
            }
        }
        return c;
    }
    int getKB(int n , int k){
        return (n&(1<<k));
    }

}