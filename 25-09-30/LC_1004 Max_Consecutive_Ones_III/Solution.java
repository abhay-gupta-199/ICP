
class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, z = 0, res = 0;

        for (int r = 0; r < n; r++) {
            if (nums[r] == 0) {
                z++;
            }

            while (z > k) {
                if (nums[l] == 0) {
                    z--;
                }
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
