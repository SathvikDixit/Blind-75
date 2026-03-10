public class CountFrequency {
    public static void countFreq(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    } //    T.C = O(n*n)

    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 9, 1, 4, 2, 0, 0};
        countFreq(arr);
    }
}
