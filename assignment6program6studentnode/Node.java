/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6program6studentnode;

public class Node {
    public String first;
    public String last;
    public int score;
    public Node next;
    public Node prev;
    
    
    // Explicit Constructor
    public Node(String f, String l, int s){
        first = f;
        last = l;
        score = s;
        this.next = null;
        this.prev = null;
    }
        
    
}