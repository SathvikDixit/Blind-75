//      LeetCode 217

/*
import java.util.*;
public class ContainsDuplicates {
    public static Boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
    public static void main(String args[]) {
        int[] nums = {4, 6, 1, 10, 2, 3, 8};
        Boolean abc = containsDuplicate(nums);
        System.out.println("Contains duplicates: " +abc);
    }
}

 */


//  Optimized Solution using Set


import java.util.*;
public class ContainsDuplicates {
    public static String containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer>  set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        if (set.size() == n) {
            return "No Duplicates found <3";
        }
        return "This shit contains Duplicates";
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        String soln = containsDuplicate(nums);
        System.out.println(soln);
    }
}