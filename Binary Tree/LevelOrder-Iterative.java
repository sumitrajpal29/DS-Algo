class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
      
        Queue<Node> q=new LinkedList<>();
            q.offer(node);
      
            Node temp=null;
        while(!q.isEmpty()){
            temp=q.poll();
            
            list.add(temp.data);
            
            if(temp.left!=null)
                q.offer(temp.left);
            if(temp.right!=null)
                q.offer(temp.right);
        }
        
        return list;
    }
}
