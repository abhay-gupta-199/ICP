
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(combine(n, k));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), res);
        return res;
    }

    public static void backtrack(int x, int n, int k, List<Integer> l, List<List<Integer>> res) {
        if (l.size() == k) {
            res.add(new ArrayList<>(l));
            return;
        }

        for (int i = x; i <= n; i++) {
            l.add(i);
            backtrack(i + 1, n, k, l, res);
            l.remove(l.size() - 1);
        }
    }
}
