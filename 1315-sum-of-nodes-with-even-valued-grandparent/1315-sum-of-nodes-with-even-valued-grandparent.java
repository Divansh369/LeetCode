class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int count = 0;
        if (root.val % 2 == 0) {
            count += sumOfGrandChildren(root);
        }
        
        count += sumEvenGrandparent(root.left);
        count += sumEvenGrandparent(root.right);
        
        return count;
    }
    
    private int sumOfGrandChildren(TreeNode root) {
        int sum = 0;
        if (root.left != null) {
            if (root.left.left != null) {
                sum += root.left.left.val;
            }
            if (root.left.right != null) {
                sum += root.left.right.val;
            }
        }
        if (root.right != null) {
            if (root.right.left != null) {
                sum += root.right.left.val;
            }
            if (root.right.right != null) {
                sum += root.right.right.val;
            }
        }
        return sum;
    }
}
