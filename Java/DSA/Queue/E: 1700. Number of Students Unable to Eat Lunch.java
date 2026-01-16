https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

// Time Complexity: O(n) Space Complexity: O(n)
import java.util.LinkedList;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<students.length; i++) {
            queue.add(students[i]);
        }

        int top = 0;
        int notEaten = 0;
        int eaten = 0;
        while (queue.size() != notEaten ) {
            int curr = queue.poll();
            if (curr == sandwiches[top]) {
                top++;
                notEaten=0;
                eaten++;
            } else {
                queue.add(curr);
                notEaten++;
            }
        }

        return (students.length-eaten);
    }
}