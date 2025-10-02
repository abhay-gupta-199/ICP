
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        System.out.println(Arrays.toString(reconstructQueue(people)));
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> res = new ArrayList<>();
        for (int[] x : people) {
            res.add(x[1], x);
        }
        return res.toArray(new int[people.length][2]);
    }
}
