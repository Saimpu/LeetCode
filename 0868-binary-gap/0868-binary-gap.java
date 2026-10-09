class Solution {
    public int binaryGap(int n) {
       int max = 0;
       int c = 0;
       int st = -1;
    //    if((n&n-1) == 0){
    //         return 0;
    //    }
       while(n>0){
            c++;
            if((n&1) == 1){
                if(st != -1){
                    max = Math.max(max,c - st);
                }
                st = c;
            }
            n = n>>1;
       } 
       return max;
    }
}