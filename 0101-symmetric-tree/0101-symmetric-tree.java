class Solution {
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false; //1
        if(p!=null && q==null) return false; //2 (1,2)-->if(p==null || q==null) return f 
        if(p.val!=q.val) return false;
        if(isSameTree(p.left,q.right)==false) return false;
        if(isSameTree(p.right,q.left)==false) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
       if(root==null) return true;
       if(isSameTree(root.left,root.right)==true) return true;
       return false;

    }
    }