Node reverseList(Node head)
    {
        //Corner cases
        if(head==null || head.next==null)
            return head;
            
        Node prev=null;
        Node next=head.next;
        
        while(head!=null){
            next=head.next;
            
            head.next=prev;
            prev=head;
            head=next;
            
        }
        
        head=prev;
        
        
        return head;
        
    }
