class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int c = 0;
        int ans = 1;
        while(left!=right){
           left = left>>1;
           right = right>>1;
           c++;
        }
        return right<<c;
    }
}