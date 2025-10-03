
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, target, new ArrayList<>(), res);
        return res;
    }

    public static void backtrack(int[] nums, int idx, int k, List<Integer> l, List<List<Integer>> res) {
        if (k == 0) {
            res.add(new ArrayList<>(l));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > k) {
                break;
            }

            l.add(nums[i]);
            backtrack(nums, i + 1, k - nums[i], l, res);
            l.remove(l.size() - 1);
        }
    }
}
