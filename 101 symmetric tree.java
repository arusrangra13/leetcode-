class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        // Case 1: both null
        if (left == null && right == null) return true;

        // Case 2: one null
        if (left == null || right == null) return false;

        // Case 3: values not equal
        if (left.val != right.val) return false;

        // Case 4: check mirror structure
        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}
