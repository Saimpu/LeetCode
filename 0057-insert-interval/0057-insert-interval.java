class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> li = new ArrayList<>(Arrays.asList(intervals));
        li.add(new int[]{newInterval[0],newInterval[1]});
        int results[][] = li.toArray(new int[0][]);
        Arrays.sort(results,(a,b)->Integer.compare(a[0],b[0]));
        li.clear();
        int start = results[0][0];
        int end = results[0][1];
        for(int i = 0;i<results.length;i++){
            if(end >= results[i][0]){
                end = Math.max(end,results[i][1]);
            }else{
                li.add(new int[]{start,end});
                start = results[i][0];
                end = results[i][1];
            }
            if(i==results.length-1){
                li.add(new int[]{start,end});
            }
        }
        return li.toArray(new int[0][]);
    }
}