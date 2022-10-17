/*
LeetCode Link :
  https://leetcode.com/problems/binary-tree-preorder-traversal/

Approach :
  Print root
  Go left(It will be printed also, because its is recursive call)
  Go right
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }
    void preorderTraversal(TreeNode root,List<Integer> list){
        if(root==null)
            return;
        
        list.add(root.val);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);
    }
}
