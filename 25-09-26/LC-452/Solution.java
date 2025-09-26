
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 0, arw = 0;
        for (int[] x : points) {
            if (res == 0 || x[0] > arw) {
                arw = x[1];
                res++;
            }
        }
        return res;
    }
}
