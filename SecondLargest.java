public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } 
            if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }
        System.out.println("Largest element is: "+largest);
        return  secLargest;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 10, 5, 1};
        System.out.println("The second largest element is: " + secondLargest(arr));
    }
}
