public class MaxAndMinFreq {
    public static void maxNminFreq(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = arr[i];
            }
            if (count < minFreq) {
                minFreq = count;
                minEle = arr[i];
            }
        }
        System.out.println("Maximum frequency is " + maxFreq + " and the element  with max freq is " + maxEle);
        System.out.println("Minimum frequency is " + minFreq + " and the element  with minimum frequency is " + minEle);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 5, 1, 3, 5, 10 };
        int n = arr.length;
        maxNminFreq(arr, n);
    }
}
