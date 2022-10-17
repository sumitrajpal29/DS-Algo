/*
LeetCode Link :
https://leetcode.com/problems/binary-tree-postorder-traversal/
Approach :
  Go left
  Go right
  Print root
*/


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postorderTraversal(root,list);
        return list;
    }
    void postorderTraversal(TreeNode root, List<Integer> list){
      //base case
        if(root==null)
            return;
        
        postorderTraversal(root.left,list);
        postorderTraversal(root.right,list);
        list.add(root.val);
    }
}
