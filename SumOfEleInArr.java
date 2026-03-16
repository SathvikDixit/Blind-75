import java.util.Arrays;

public class SumOfEleInArr {
    public static int sumOfEle(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumOfEleOptimal(int[] arr, int n) {
        return Arrays.stream(arr).sum();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8, 9};
        int n = arr.length;

        System.out.println("Sum of elements with most naive solution [T.C => O(1)]: "+sumOfEle(arr, n));

        System.out.println("Sum of elements with optimal solution [T.C => O(1)]: "+sumOfEleOptimal(arr, n));
    }
}






