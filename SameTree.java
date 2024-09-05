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

public class SameTree {
    public static boolean sameTree(TreeNode p, TreeNode q) {
        // if both trees are null, then they are identical 
        if (p == null && q == null) {
            return true;
        }
        // if one tree is null and the other is not
        // OR if the values do not match 
        // tree is not identical 
        if (p == null || q == null || p.value != q.value) {
            return false;
        }
        // recursive call for left and right subtrees
        return sameTree(p.left, q.left) && sameTree(p.right, q.right);
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
        System.out.println("Example 1: ");
        // tree1 {1,2,3}
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        printTree(tree1);
        System.out.println();

        // tree2 {1,2,3}
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);
        printTree(tree2);
        System.out.println();

        System.out.println(sameTree(tree1, tree2) + "\n");

        System.out.println("Example 2: ");
        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        printTree(tree3);
        System.out.println();
        
        TreeNode tree4 = new TreeNode(1);
        tree4.right = new TreeNode(2);
        printTree(tree4);
        System.out.println();

        System.out.println(sameTree(tree3, tree4) + "\n");

        System.out.println("Example 3: ");
        TreeNode tree5 = new TreeNode(1);
        tree5.left = new TreeNode(2);
        tree5.right = new TreeNode(1);
        printTree(tree5);
        System.out.println();

        TreeNode tree6 = new TreeNode(1);
        tree6.left = new TreeNode(1);
        tree6.right = new TreeNode(2);
        printTree(tree6);
        System.out.println();

        System.out.println(sameTree(tree5, tree6) + "\n");
        
    }
}
