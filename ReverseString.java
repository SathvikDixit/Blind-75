public class ReverseString {
    public static String revSttr(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length() / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[str.length() - 1 - i];
            arr[str.length() - 1 - i] = temp;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str+" is the original string");
        System.out.println(revSttr(str)+" is the reversed string");
    }
}
