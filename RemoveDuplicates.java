import java.util.*;
public class RemoveDuplicates {

    public static int[] removeDuplicts(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return Arrays.copyOf(arr, j+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 7, 9};
        int[] ans = removeDuplicts(arr);
        System.out.println(Arrays.toString(ans));
    }
}






