import java.util.Arrays;

public class ArrayRotation {

    static void RightRotate(int[] nums, int k) {

        int n = nums.length;
        int[] temp = new int[n];
        
        // If rotation is greater than the size of array
        k = k % n;

        for (int i = 0; i < n; i++) {
            if (i < k) {
                // print rightmost kth elements 
                // System.out.print(nums[n + i - k] + " ");
                temp[i] = nums[n + i - k];
            } else {
                // print array after 'k' elements 
                // System.out.print(nums[i - k] + " ");
                temp[i] = nums[i-k];
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        
        int k = 2;
        RightRotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
