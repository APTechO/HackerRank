import java.util.Arrays;

public class MaxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        System.out.println("\n11. Container With Most Water\n");
        MaxArea solution = new MaxArea();

        System.out.println("Example 1");
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Input: height = " + Arrays.toString(heights1));
        System.out.println("Output: " + solution.maxArea(heights1));

        System.out.println("\nExample 2");
        int[] heights2 = {1, 1};
        System.out.println("Input: height = " + Arrays.toString(heights2));
        System.out.println("Output: " + solution.maxArea(heights2));

    }
}
