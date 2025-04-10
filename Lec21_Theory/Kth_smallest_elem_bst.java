package AC.Lec21_Theory;

import AC.Lec20_Theory.Delete_Node_bst;

public class Kth_smallest_elem_bst {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int count = 0 , out = 0;
    public void inorder(TreeNode root ,int k ){
        if(root == null)return;

        inorder(root.left , k);
        count++;
        if(count == k){
            out = root.val;
            return ;
        }

        inorder(root.right , k);

    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)return 0;
        inorder(root , k);
        return out;
    }
}
