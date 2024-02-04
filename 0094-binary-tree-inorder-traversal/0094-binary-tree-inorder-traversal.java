import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        inorderTraversalHelper(root, in);
        return in;
    }

    private void inorderTraversalHelper(TreeNode root, List<Integer> in) {
        if (root == null) {
            return;  // Exit the recursion if the current node is null
        }

        inorderTraversalHelper(root.left, in);
        in.add(root.val);
        inorderTraversalHelper(root.right, in);
    }}