class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            String str = list2[j];
             if (map.containsKey(str)) {
                int indexSum = map.get(str) + j;
                if (indexSum < minSum) {
                    minSum = indexSum;
                    result.clear();
                    result.add(str);
                }
                else if (indexSum == minSum) {
                    result.add(str);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}