// Leetcode 238

/*
public class ProdOfArrExceptSelf {
    public static int[] productOfArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if(i != j) {
                    product *= arr[j];
                }
                ans[i] = product;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] soln = productOfArray(arr);

        for(int nums : soln) {
            System.out.print(" "+nums);
        }
    }
}  */
                       
/*                             Time Complixity = O(N^2)                       */


//                      Optimal Aproach

public class ProdOfArrExceptSelf {
    public static int[] productExceptSelf (int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        suffix[n-1] = 1;
        for (int i = n-2; i > -1; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] soln = productExceptSelf(arr);

        for (int nums : soln) {
            System.out.print(" "+nums);
        }
    }
}
//                                  Time Complixity = O(N);