
class Solution {

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int l = 0, max = 0, res = 0;

        for (int r = 0; r < n; r++) {
            freq[s.charAt(r) - 'A']++;
            max = Math.max(max, freq[s.charAt(r) - 'A']);

            while (r - l + 1 - max > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
