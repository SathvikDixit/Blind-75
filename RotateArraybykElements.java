public class RotateArraybykElements {
    public static void reverseSection(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        if(k == 0) return;

        reverseSection(arr, 0, k - 1);
        reverseSection(arr, k, n - 1);
        reverseSection(arr, 0, n-1);
    }

    /*public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        leftRotate(arr, n - (k%n));
    }*/

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        leftRotate(arr, k);
        System.out.println("Left Rotation: ");
        for(int num : arr) System.out.print(num+" ");
        System.out.println();

        arr = new int[]{1, 2, 3, 4, 5, 6};

        /*rightRotate(arr, k);
        System.out.println("Right rotation: ");
        for(int num : arr) System.out.print(num+" ");
        System.out.println();*/
    }
}
