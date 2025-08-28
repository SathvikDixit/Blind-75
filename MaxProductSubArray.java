public class MaxProductSubArray {
    static int productSubarray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int pre = 1;
        int suff = 1;
        int n = arr.length;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        
        for (int i = 0; i < n; i++) {
            if (start == 0) start = i;
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;

            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
            ansStart = start;
            ansEnd = i;
        }
        System.out.println("SubArray started from index ["+ansStart+" "+ansEnd+"]");
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int soln = productSubarray(arr);
        System.out.println("Maximum product Subarray is: "+soln);
    }
}
