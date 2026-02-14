import java.util.*;

class Anagram{
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "tac";

        if(isAnagram(s1, s2)) {
            System.out.println("Given Strings are Anagram");
        }
        else {
            System.out.println("Given strings are not anagram");
        }
    }
}