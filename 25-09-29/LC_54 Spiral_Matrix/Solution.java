
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(a));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while (minr <= maxr && minc <= maxc) {
            for (int i = minc; i <= maxc; i++) {
                res.add(matrix[minr][i]);
            }
            minr++;

            for (int i = minr; i <= maxr; i++) {
                res.add(matrix[i][maxc]);
            }
            maxc--;

            for (int i = maxc; i >= minc && minr <= maxr; i--) {
                res.add(matrix[maxr][i]);
            }
            maxr--;

            for (int i = maxr; i >= minr && minc <= maxc; i--) {
                res.add(matrix[i][minc]);
            }
            minc++;
        }

        return res;
    }
}
