
class Solution {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        return binary(matrix[row(matrix, target)], target);
    }

    public static int row(int[][] ar, int t) {
        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i][0] <= t) {
                return i;
            }
        }
        return 0;
    }

    public static boolean binary(int[] ar, int t) {
        int l = 0, h = ar.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (ar[mid] == t) {
                return true;
            } else if (ar[mid] > t) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
