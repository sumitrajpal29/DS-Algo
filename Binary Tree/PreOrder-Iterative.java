class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        
        Node temp=null;
        while(!stack.isEmpty()){
            temp=stack.pop();
            list.add(temp.data);
            
            if(temp.right!=null)
            stack.push(temp.right);
            
            if(temp.left!=null)
            stack.push(temp.left);
        }
        
        return list;
    }

}
