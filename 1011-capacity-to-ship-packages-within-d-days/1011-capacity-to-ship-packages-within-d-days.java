class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i=0;
        int j=0;
        for (int weight : weights) {
            i = Math.max(i, weight); // max element
            j += weight;             // sum of all elements
        }
        int ans=0;
        while(i<=j){
            int mid = i+(j-i)/2;
            int currentWeight=0;
            int requiredDays=1;
            for (int weight : weights) {
                if (currentWeight + weight > mid) {
                    requiredDays++;
                    currentWeight = weight;
                } else {
                    currentWeight += weight;
                }
            }

            if(requiredDays>days){
                 i = mid+1;
            }else{
                j = mid-1;
               
            }
        }
        return i;
    }
}