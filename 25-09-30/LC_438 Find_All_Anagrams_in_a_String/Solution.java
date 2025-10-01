
import java.util.*;

class Solution {

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int m = p.length();
        int n = s.length();

        if (n < m) {
            return res;
        }

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (char ch : p.toCharArray()) {
            f1[ch - 'a']++;
        }

        int l = 0;
        for (int r = 0; r < n; r++) {
            f2[s.charAt(r) - 'a']++;

            if (r - l + 1 < m) {
                continue;
            }

            if (Arrays.equals(f1, f2)) {
                res.add(l);
            }

            f2[s.charAt(l) - 'a']--;
            l++;
        }
        return res;
    }
}
