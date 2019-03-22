/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6program5nodes;

public class LinkedList {
    public Node head;
    public Node tail;
    
    // constructor
    public LinkedList(){
        head = null;
        tail = null;
   
    }
    
    // add next node
    public void addNextNode(Integer n){
        Node temp = new Node(n);
                    
        // if list is empty
        if(head == null){

            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    
    // add node method
    public void addNodeInOrder(Integer n){
        Node temp = new Node(n);
        Node before = null;
        Node after = null;
        
        // if list is empty
        if(head == null){
            head = temp;
            tail = temp;
        }
        
        // in front of list
        else if(temp.n < head.n){
            temp.next = head;
            head = temp;
        }
        
        // end of list
        else if(tail.n < temp.n){
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        
        // if node is in the middle
        else{
            before = head;
            after = head.next;
            while(after != null){
                if(before.n <= temp.n && after.n >= temp.n)
                    break;
                before = after;
		after = after.next;
            }
            // attach the node to be inserted
            before.next = temp;
            temp.next = after;
        }
        
    }
    
    // add node method
    public void deleteNode(Integer n){
        Node before = null;
        Node after = null;
        
        // if list is empty
        if(head == null){
            return;
        }
        
        // delete first item on list
        else if(n == head.n){
            head = head.next;
            // if only one item in list
            if(head == null)
                tail = null;
        }
        
        // search for item
        else{
            before = head;
            after = head.next;
            
            // cycle through list
            while(after != null){
                if(after.n == n)
                    break;
                else{
                    before = after;
                    after = after.next;
                }
            }
            // if not found do nothing
            // Found IT!
            if(after!= null){
                // delete next
                before.next = after.next;
                // delete prev
                after = after.next;
                after.prev = before;
            }
        }  
    }
    
    // display
    public void displayNodes(Node head){
        Node temp = head;
        System.out.print("[");
        while(temp != null){
            if(temp.next != null)
                System.out.print(temp.n + ", ");
            else
                System.out.print(temp.n);
            temp = temp.next;
        }
        System.out.print("]");
    }
    
    // display every other node
    public void displayEveryOtherNode(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.next.next != null)
                System.out.print(temp.n + ", ");
            else
                System.out.print(temp.n);
            temp = temp.next.next;
            
        }
    }
    
    // delete odd nodes
    public LinkedList deleteOddNodes(Node head){
        LinkedList ls = new LinkedList();
        Node check = head;
        
        // list is empty
        if(head == null)
            return null;

        // cycle through list
        while(check.next != null){
            
            // add to new node list
            if(check.n % 2 == 0){
                
                // new list
                ls.addNextNode(check.n);
            }
            check = check.next;
        }
        return ls;
    }
}
