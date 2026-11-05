class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j){
            int num = Math.min(height[i],height[j]);
            int cap = num*(j-i);
            if(cap>max){
                max = cap;
            }
            if(height[i] == height[j]){
                i++;
                j--;
            }else if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}