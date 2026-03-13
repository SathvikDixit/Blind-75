public class SecondSmall {
    public static int secondSmallest(int[] arr) {
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            smallest = Math.min(smallest, arr[i]);
            if (arr[i] < secSmall && arr[i] != smallest){
                secSmall = arr[i];
            }
        }
        return secSmall;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4, 5};
        System.out.println("second smalled element is: "+SecondSmall.secondSmallest(arr));
    }
}
