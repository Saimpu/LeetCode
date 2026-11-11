class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int i = 0;
        int end = arr.length - 1;

        while (end - i + 1 > k) {

            int diff1 = Math.abs(x - arr[i]);
            int diff2 = Math.abs(x - arr[end]);

            if (diff1 > diff2) {
                i++;
            } else {
                end--;
            }
        }

        List<Integer> li = new ArrayList<>();

        for (int l = i; l <= end; l++) {
            li.add(arr[l]);
        }

        return li;
    }
}