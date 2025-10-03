
class Solution {

    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int a = 0, b = 0;
        for (int bill : bills) {
            if (bill == 5) {
                a++;
            } else if (bill == 10) {
                if (a >= 1) {
                    a--;
                    b++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (a >= 1 && b >= 1) {
                    a--;
                    b--;
                } else if (a >= 3) {
                    a -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
