// Leet Code: 53

/*
  public class ProductOfSubArray {
    public static int prodOfSubarray(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 6};
        int n = arr.length;
        int ans = prodOfSubarray(arr, n);
        System.out.println("The maximum sum of subarray is: " + ans);
    }
} 

 */
//                          Time Complexity: O(n^2) 


// Optimal Solution

public class ProductOfSubArray {
    public static int prodOfSubarray(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) maxi = sum;
            if (sum < 0) sum = 0;
            if (maxi < 0) maxi = 0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int ans = prodOfSubarray(arr, n);
        System.out.println("The maximum sum of subarray is: " + ans);
    }
} 