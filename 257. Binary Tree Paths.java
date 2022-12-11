/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        //output should be list of stirng 
        List<String> ans=new ArrayList<>();
        
        //lets create an helper method to go through all the element
        helper(ans,"",root);
        return ans;
    }
    public void helper(List<String> ans,String s,TreeNode root){
        // if root has no value jest return the string
        if(root==null) return;
        
        //suppose it has no left and right means it is the leaf node 
        //we should add to list and return for the next
        if(root.left==null && root.right==null){
            s+=root.val+"";
            ans.add(s);
            return;
            
            //if it is not a leaf node just add to string
        }else{
            s+=root.val+"->";
        }
        
        //recurion for left and right node and add to list
        helper(ans,s,root.left);
        helper(ans,s,root.right);
    }
}