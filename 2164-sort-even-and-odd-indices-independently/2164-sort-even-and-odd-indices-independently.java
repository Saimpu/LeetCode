class Solution {
    public int[] sortEvenOdd(int[] nums) {

        for (int i = 0; i < nums.length; i += 2) {

            int minIndex = i;

            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        for (int i = 1; i < nums.length; i += 2) {

            int maxIndex = i;

            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        return nums;
    }
}