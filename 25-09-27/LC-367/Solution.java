
class Solution {

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int l = 1, h = num;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (m >= num / m) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l * l == num;
    }
}
