class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int decimal = 0;
        int base = 1;
        while(n > 0){
            int r = n&1;
            decimal +=(r ^ 1) * base;
            base *= 2;
            n = n>>1;
        }
        return decimal;
    }
}