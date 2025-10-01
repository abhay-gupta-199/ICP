
import java.util.*;

class Solution {

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (char ch : s1.toCharArray()) {
            f1[ch - 'a']++;
        }
        int l = 0;
        for (int r = 0; r < n; r++) {
            f2[s2.charAt(r) - 'a']++;

            if (r - l + 1 < m) {
                continue;
            }

            if (Arrays.equals(f1, f2)) {
                return true;
            }

            f2[s2.charAt(l) - 'a']--;
            l++;
        }
        return false;
    }
}
