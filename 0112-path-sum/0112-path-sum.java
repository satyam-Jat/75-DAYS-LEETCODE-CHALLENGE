class Solution {
    int sum=0;
    public boolean helper(TreeNode root,int sum){
        if(root==null) return false;
        if(root.left==null && root.right==null){ //leaf node
            return (sum==root.val);  //if exist return true
        }
        int remaining=sum-root.val;
       return (helper(root.left,remaining) || helper(root.right,remaining)); //any of one or two satify 
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum); //return the final true or false;
    }
}