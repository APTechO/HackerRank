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
public class InvertBinaryTree {
    static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static TreeNode invertTree(TreeNode root) {
        // check if root is null
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public static void main(String[] args) {
        // [4, 2, 7, 1, 3, 6, 9]
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        root1.left.left.left = new TreeNode(6);
        root1. left.left.right = new TreeNode(9);
        printTree(root1);
        System.out.println();
        invertTree(root1);
        printTree(root1);

    }
}
