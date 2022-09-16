public class CLL{
    static Node head =null;
    
   static class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value=value;
        }
    }
  
  
static void delete(Node node){
        //corner cases
        if(node==null)
            return;
        //Delete head and head is only node
        if(node==head && head.next==head){
            head=null;
            return;
        }
            
        //Delete head
        if(node==head){
            Node last=head;
            while(last.next!=head)
                last=last.next;
            last.next=head.next;
            head=head.next;
            
            return;
        }
        
        //Delete non-head node
        Node prev=head;
        while(prev.next!=node && prev.next!=head){
            prev=prev.next;
        }
        if(prev.next==node)
        prev.next=node.next;
    }
  
  
    static void addToFront(int d){
        if(head==null){ 
            System.out.println("CLL is empty.");
            return;
        }
        Node node=new Node(d);
        
        Node temp=head;
        while(temp.next!=head)
            temp=temp.next;
        temp.next=node;
        
        node.next=head;
        
        head=node;
    }
  
  static void addToPos(Node pos, int d){
        if(head==null){ 
            System.out.println("CLL is empty.");
            return;
        }
        Node node=new Node(d);
        
        Node curr=head;
        
        while(curr!=pos && curr.next!=head){
            curr=curr.next;
        }
        if(curr==pos){
            node.next=curr.next;
            curr.next=node;
        }
        
    }
  
  
    static void push(int d){
        Node node=new Node(d);
        
        if(head==null){
            head=node;
            head.next=head;
        }
        else{
            Node prev=head;
            while(prev.next!=head)
                prev=prev.next;
            node.next=head;
            prev.next=node;
        }
        
    }
    
    static void print(){
        if(head==null) return;
        
        Node curr=head;
        do{
            System.out.println(curr.value);
            curr=curr.next;
        }while(curr!=head);
    }
    
    public static void main(String[] sumit){
        
        CLL cll=new CLL();
        for(int i=0; i<13; i++)
        cll.push(i);
        
        cll.print();
    }
    
}
