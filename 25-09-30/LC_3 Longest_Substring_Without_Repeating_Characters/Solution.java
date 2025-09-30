
import java.util.*;

class Solution {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, ans = 0;
        int[] hash = new int[255];
        Arrays.fill(hash, -1);
        while (r < s.length()) {
            if (hash[s.charAt(r)] >= 0 && l <= hash[s.charAt(r)]) {
                l = hash[s.charAt(r)] + 1;
            }
            hash[s.charAt(r)] = r;
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
