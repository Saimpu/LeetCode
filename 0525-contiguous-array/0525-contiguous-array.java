class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hm= new HashMap<>();
        hm.put(0,-1);
        int cnt=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) cnt-=1;
            else cnt++;
            if(hm.containsKey(cnt)){
                ans=Math.max(ans,i-hm.get(cnt));
            }
            else{
                hm.put(cnt,i);
            }
        }
        return ans;
    }
}