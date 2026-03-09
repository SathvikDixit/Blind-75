import java.util.*;
public class IncreaseDecreaseArray {
    public static int[] increase(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        return temp;
    }

    public static int[] decrease(int[] arr) {
        int[] tempri = arr.clone();
        Arrays.sort(tempri);

        int l = 0, r = tempri.length - 1;
        while (l < r) {
            int temp = tempri[l];
            tempri[l] = tempri[r];
            tempri[r] = temp;
            l++;
            r--;
        }
        return tempri;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1};
        int[] ans = increase(arr);
        int[] ans2 = decrease(arr);
        System.out.println("Given Array: "+Arrays.toString(arr));
        System.out.println("The array in increasing order is: " + Arrays.toString(ans));
        System.out.println("The array in decreasing order is: " + Arrays.toString(ans2));
        
    }
}