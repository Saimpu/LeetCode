class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // Arrays.sort(cardPoints);
        int n=cardPoints.length;
        int sum=0;
        int size=n-k;
        for(int i=0;i<size;i++){
            sum+=cardPoints[i];
        }
        int i=0;
        int j=size;
        int min=sum;
        int total =sum;
        while(j<n){
            sum+=cardPoints[j];
            total+=cardPoints[j];
            sum-=cardPoints[i];
            j++;
            min=Math.min(min,sum);
            // sum-=cardPoints[i];
            i++;
        }
        return total-min;
        
    }
}