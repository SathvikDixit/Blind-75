public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        return  secLargest;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 8, 5, 1};
        System.out.println("The second largest element is: " + secondLargest(arr));
    }
}
