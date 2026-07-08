class Solution {
    public int hIndex(int[] citations) {
        int i=0;
        int j=citations.length-1;
        int n=citations.length;
        // if(n<=1){
        //     return citations[0]>0?1:0;
        // }
        while(i<=j){
            int mid = i+(j-i)/2;
            int papers = n-mid;
            if(citations[mid]==papers){
                return citations[mid];
            }else if(citations[mid]<papers){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return n-i;
    }
}