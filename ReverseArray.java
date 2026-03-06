

public class ReverseArray {
    public void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        ReverseArray rv = new ReverseArray();
        rv.reverseArray(arr);   
        for(int nums : arr) {
            System.out.print(" "+nums);
        }
    }
}
