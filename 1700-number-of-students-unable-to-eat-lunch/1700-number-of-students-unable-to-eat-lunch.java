import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new ArrayDeque<>();

        for (int student : students) {
            q.offer(student);
        }

        int rotations = 0;
        int i = 0;

        while (!q.isEmpty() && i < sandwiches.length) {

            if (q.peek() == sandwiches[i]) {
                q.poll();
                i++;
                rotations = 0;
            } else {
                q.offer(q.poll());
                rotations++;
            }

            if (rotations == q.size()) {
                return q.size();
            }
        }

        return q.size();
    }
}