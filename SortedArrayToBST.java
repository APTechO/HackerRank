import java.util.Arrays;
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int value) {this.value = value;}
    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return createBalancedBST(nums, 0, nums.length - 1);
    }

    private static TreeNode createBalancedBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBalancedBST(nums, left, mid - 1);
        root.right = createBalancedBST(nums, mid + 1, right);

        return root;
    }

    private static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Example 1:");
        int[] nums1 = {-10, -3, 0, 5, 9};
        System.out.println(Arrays.toString(nums1));
        printTree(sortedArrayToBST(nums1));
        System.out.println("\n");

        System.out.println("Example 2:");
        int[] nums2 = {1, 3};
        System.out.println(Arrays.toString(nums2));
        printTree(sortedArrayToBST(nums2));
        System.out.println();
    }
}
