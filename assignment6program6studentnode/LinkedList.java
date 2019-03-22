/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6program6studentnode;

public class LinkedList {
    public Node head;
    public Node tail;
    
    // constructor
    public LinkedList(){
        head = null;
        tail = null;
   
    }
    
    // add next node
    public void addNextNode(String f, String l, Integer s){
        Node temp = new Node(f,l,s);
                    
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
    public void addNodeInOrder(String f, String l, Integer s){
        Node temp = new Node(f,l,s);
        Node before = null;
        Node after = null;
        
        // if list is empty
        if(head == null){
            head = temp;
            tail = temp;
        }
        
        // in front of list
        else if(temp.score < head.score){
            temp.next = head;
            head = temp;
        }
        
        // end of list
        else if(tail.score < temp.score){
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        
        // if node is in the middle
        else{
            before = head;
            after = head.next;
            while(after != null){
                if(before.score <= temp.score && after.score >= temp.score)
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
    public void deleteNode(Integer s){
        Node before = null;
        Node after = null;
        
        // if list is empty
        if(head == null){
            return;
        }
        
        // delete first item on list
        else if(s == head.score){
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
                if(after.score == s)
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
        while(temp != null){
            
            System.out.print(temp.first + " " + temp.last + " scored " + temp.score);
            System.out.println("");
            temp = temp.next;
        }
    }
    
    public int findNameInNonAlphabeticalList(String name){
        name.toLowerCase();
        Node temp = head;
        boolean done = false;
        
        while(!done){
            // start at begining and compare
            if(name.compareTo(temp.last.toLowerCase() ) < 0){
                System.out.println("too soon");
                temp = temp.next;
            }
            // found
            else if(name.compareTo(temp.last.toLowerCase() ) == 0){
                System.out.println("found");
                done = true;
                break;
                
            }
            // not found
            else if(name.compareTo(temp.last.toLowerCase() ) > 0){
                System.out.println("not found");
                done = true;
            }
        }
        return temp.score;
    }

    public int findNameInNonOrderList(String name){
            Node temp = head;
        
        while(temp.next != null){
            // compare
            if(name.compareTo(temp.last) != 0)
                temp = temp.next;
            else
                break;
                
        }
        return temp.score;
    }
}
