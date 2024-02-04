class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: if both nodes are null, they are equal
        if (p == null && q == null) {
            return true;
        }
        
        // If one node is null and the other is not, they are not equal
        if (p == null || q == null) {
            return false;
        }
        
        // Check if the values of the current nodes are equal
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
