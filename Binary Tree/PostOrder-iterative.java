class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)
            q.offer(root);        
        
        boolean flag=false;
        TreeNode temp=null;
        
        while(!flag || temp!=root){            
            temp=q.poll();
            
            if(temp.right!=null)
                q.offer(temp.right);
            if(temp.left!=null)
                q.offer(temp.left);
            
            q.offer(temp);
            flag=true;
        }
        
        q.offer(q.poll());
        
        while(!q.isEmpty())
            list.add(q.poll().val);
        
        return list;
    }
}
