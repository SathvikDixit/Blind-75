import java.util.*;
public class IncreaseDecreaseArray {
    public static int[] increase(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] decrease(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1};
        int[] ans = increase(arr);
        System.out.println("The array in increasing order is: " + Arrays.toString(ans));
    }
}