class Solution {
    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            }
            return a[1] - b[1];
        });

        List<int[]> li = new ArrayList<>();

        for (int i = 0; i < people.length; i++) {

            int in = people[i][1];

            li.add(in, new int[]{
                people[i][0],
                people[i][1]
            });
        }

        return li.toArray(new int[li.size()][]);
    }
}