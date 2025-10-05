
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robber(nums, 0, dp);
    }

    public static int robber(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = nums[i] + robber(nums, i + 2, dp);
        int dont_rob = robber(nums, i + 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }
}
