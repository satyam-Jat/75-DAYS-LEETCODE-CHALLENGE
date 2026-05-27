   class Solution {
    public int level(TreeNode root){
        if(root==null) return 0;
        return (1+Math.max(level(root.left),level(root.right)));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
       int vl= level(root.left)+level(root.right);
       int l= diameterOfBinaryTree(root.left);
        int r=diameterOfBinaryTree(root.right);

        return Math.max(vl,Math.max(l,r));
    }
}