class Solution {
    public int countNegatives(int[][] grid) {
        int c = 0;
        for(int i = 0;i<grid.length;i++){
            int l = 0;
            int r = grid[0].length-1;
           int firstNeg = grid[0].length;
            while(l <= r){
                int mid = (l + r) / 2;
                if(grid[i][mid] < 0){
                    firstNeg = mid;
                    r = mid - 1; 
                } else {
                    l = mid + 1; 
                }
            }
            c += (grid[0].length - firstNeg);
        }
        return c;
    }
}