import java.util.*;

class longestSubStr {

    public static int longestSubStr(String s) {
        int n = s.length();
        int maxLength = 0; 

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (allUnique(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    private static boolean allUnique(String s, int start, int end) {
        HashSet<Character> set = new HashSet<>();
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int soln = longestSubStr(s);
        System.out.println(
            "The length of the longest substring without repeating characters is: " + soln
        );
    }
}
