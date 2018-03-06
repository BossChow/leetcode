public class Solution {
    public static void main(String[] args) {
        TreeNode t1 = genTestTree1();
        TreeNode t2 = genTestTree2();
        System.out.println("Tree1");
        printTree(t1);
        System.out.println("Tree2");
        printTree(t2);
        System.out.println("======");
        TreeNode rootNode = mergeTrees(t1, t2);
         printTree(rootNode);
    }

    private static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode newNode = new TreeNode(calNewVal(t1, t2));
        if ((t1 != null && t1.left != null) || (t2 != null && t2.left != null)) {
            newNode.left = mergeTrees(t1.left, t2.left);
        }
        if ((t1 != null && t1.right != null) || (t2 != null && t2.right != null)) {
            newNode.right = mergeTrees(t1.right, t2.right);
        }

        return newNode;
    }

    private static TreeNode genTestTree1() {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(3);
        rootNode.right = new TreeNode(2);
        rootNode.left.left = new TreeNode(5);

        return rootNode;
    }

    private static TreeNode genTestTree2() {
        TreeNode rootNode = new TreeNode(2);
        rootNode.left = new TreeNode(1);
        rootNode.right = new TreeNode(3);
        rootNode.left.right = new TreeNode(4);
        rootNode.right.right = new TreeNode(7);

        return rootNode;
    }

    private static int calNewVal(TreeNode t1, TreeNode t2) {
        System.out.println("Cal val: " + t1 + " : " + t2);
        int res = 0;
        if (t1 != null) res += t1.val;
        if (t2 != null) res += t2.val;
        return res;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    private static void printTree(TreeNode rootNode) {
        System.out.println("Node val: " + rootNode.val);
        if (rootNode.left != null) {
            printTree(rootNode.left);
        }

        if (rootNode.right != null) {
            printTree(rootNode.right);
        }
    }
}
