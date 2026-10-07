class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i = 0;i<=n;i++){
            int c = 0;
            int l = i;
            while(l>0){
                l = (l&(l-1));
                c++; 
            }
            a[i] = c;
        }
        return a;
    }
}