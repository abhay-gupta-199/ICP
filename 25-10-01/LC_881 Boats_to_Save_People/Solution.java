
import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int l = 0, r = people.length - 1;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }
            res++;
            r--;
        }
        return res;
    }
}
