import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    
    public static void main(String[] args) {
        RemoveDuplicateSortedArray solution = new RemoveDuplicateSortedArray();

        System.out.println("LeetCode 26. Remove Duplicates from Sorted Array\n");
        System.out.println("Example 1: ");
        int[] nums1 = {1, 1, 2};
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + solution.removeDuplicates(nums1) + ", nums = " + Arrays.toString(nums1));
        System.out.println();

        System.out.println("Example 2: ");
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + solution.removeDuplicates(nums2) + ", nums = " + Arrays.toString(nums2));

    }
}
