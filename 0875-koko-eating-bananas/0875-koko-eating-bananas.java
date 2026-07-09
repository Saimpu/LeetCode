class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j=0;
        for(int nums : piles){
            j=Math.max(j,nums);
        }
        int ans=0;
        while(i<=j){
            int mid = i+(j-i)/2;
            long hours=0;
            for(int num : piles){
                hours+=(num+mid-1)/mid;
            }
            if(hours<=h){
                ans = mid;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return ans;
    }
}