// LeetCode 153

/*
 public class MinInRotdSortedArray {
    static int minimumInRotatedSortedArray(int[] arr) {
        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 9, 1, 2, 3};
        int soln = minimumInRotatedSortedArray(arr);
        System.out.println("The minimum element in the array is: "+soln);

    }
}
 */

//                      Time Complixity = O(N)


public class MinInRotdSortedArray {
    public static int minimumInRotatedSortedArray(int[] arr) {
        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 9, 99, 2, 3};
        int soln = minimumInRotatedSortedArray(arr);
        System.out.println("The minimum element in the array is: "+soln);
    }

}









