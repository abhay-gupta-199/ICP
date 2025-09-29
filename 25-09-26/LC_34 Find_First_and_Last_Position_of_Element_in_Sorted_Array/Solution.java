
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        res[0] = (l >= 0) && (l < n) && (nums[l] == target) ? l : -1;

        l = 0;
        r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        res[1] = (r >= 0) && (r < n) && (nums[r] == target) ? r : -1;

        return res;
    }
}
