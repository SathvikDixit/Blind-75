// Leetcode 1

import java.util.*;

public class TwoSum {
    public static int[] twoSum (int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            int moreNeeded = target - sum;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(arr[i], i);
        }
        return ans;

    }
    public static void main (String args[]) {
        int[] arr = {0, 8, 3, 3, 9, 7};
        int n = arr.length;
        int target = 10;
        int[] soln = twoSum(n, arr, target);
        System.out.println("The target value found at indeces: "+soln[0]+" & "+soln[1]);
    }
}