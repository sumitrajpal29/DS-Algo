/*
GFG link :
https://practice.geeksforgeeks.org/problems/check-for-bst/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Tree&sortBy=submissions

Approach :
Check each node's value is in it's range or not.
For first node range (min,max) is (Integer.MIN_VALUE, Integer.MAX_VALUE).

Now for left node min is the same but max will be root's value.
For right node max be same but min will be root's value.

If left and right both return true, then its true. Look at recursive call.
*/




public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    boolean isBST(Node root, int min, int max){ //Method overloading
        if(root==null)
        return true;
        
        if(root.data>=max || root.data<=min)
        return false;
        
        return isBST(root.left, min, root.data)
            && isBST(root.right, root.data, max);
    }
}
