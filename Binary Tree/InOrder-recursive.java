/*
LeetCode Link :
https://leetcode.com/problems/binary-tree-inorder-traversal/

Approach :
  Go left
  Print root
  Go right
*/


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorderTraversal(list,root);
        return list;        
    }
    
    void inorderTraversal(List<Integer> list, TreeNode node){
        if(node==null)
            return;
        
        inorderTraversal(list, node.left);
        list.add(node.val);
        inorderTraversal(list, node.right);
    }
}
