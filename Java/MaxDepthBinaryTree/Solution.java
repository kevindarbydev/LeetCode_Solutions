package Java.MaxDepthBinaryTree;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void main(String[] args) {
        TreeNode roooot = new TreeNode(3,new TreeNode(9),new TreeNode(20));
        System.out.println(maxDepth(roooot));
    }

    public int maxDepth(TreeNode root) {
       if (root == null) return 0;
       int leftDepth = maxDepth(root.left);
       int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth,rightDepth);
    }
}
