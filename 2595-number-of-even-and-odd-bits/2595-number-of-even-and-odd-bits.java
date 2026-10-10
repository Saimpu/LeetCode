class Solution {
    public int[] evenOddBit(int n) {
        int[] a = new int[2];
        int ec= 0;
        int oc = 0;
        int c = 0;
        while(n>0){
            if((n&1)==1 && c%2 == 0){
                ec++;
            }
            if((n&1)==1 && c%2!=0){
                oc++;
            }
            c++;
            n = n>>1;
        }
        a[0] = ec;
        a[1] = oc;
        return a;
    }
}