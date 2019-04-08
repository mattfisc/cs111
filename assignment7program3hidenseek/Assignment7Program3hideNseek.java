/*
 * By:     Matthew Fischer
 * Date:   03/25/2019
 */
package assignment7program3hidenseek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Assignment7Program3hideNseek {

    
    public static void main(String[] args) {
        
        Queue<String> q = new LinkedList<String>();
        String name = "";
        q.add("Bobo");
        q.add("Ruth");
        q.add("Ned");
        q.add("Sam");
        q.add("Ari");
        q.add("Barb");
        q.add("Lucy");
        
        
        System.out.println("Original: " + q.toString() + "/n");
        
        // remove every third
        do{
            System.out.println("Move two to back: " + q);
            move(q);
            move(q);
            System.out.println("Two moved: " + q + "\n");
            
            name = q.peek();
            System.out.println("Remove one: " + q);
            q.remove();
            System.out.println("One removed: " + q + "\n");
           
             
            
            
            
        }while(!q.isEmpty());
        
        // Output last name
        System.out.println("You are it: " + name);
    }
    
    // move
    public static void move(Queue<String> q){
        String temp = q.peek();
        q.add(temp);
        q.remove();
    } 
}
/*
------- build 1 ------------
run:
Original: [Bobo, Ruth, Ned, Sam, Ari, Barb, Lucy]
Move two to back: [Bobo, Ruth, Ned, Sam, Ari, Barb, Lucy]
Two moved: [Ned, Sam, Ari, Barb, Lucy, Bobo, Ruth]

Remove one: [Ned, Sam, Ari, Barb, Lucy, Bobo, Ruth]
One removed: [Sam, Ari, Barb, Lucy, Bobo, Ruth]

Move two to back: [Sam, Ari, Barb, Lucy, Bobo, Ruth]
Two moved: [Barb, Lucy, Bobo, Ruth, Sam, Ari]

Remove one: [Barb, Lucy, Bobo, Ruth, Sam, Ari]
One removed: [Lucy, Bobo, Ruth, Sam, Ari]

Move two to back: [Lucy, Bobo, Ruth, Sam, Ari]
Two moved: [Ruth, Sam, Ari, Lucy, Bobo]

Remove one: [Ruth, Sam, Ari, Lucy, Bobo]
One removed: [Sam, Ari, Lucy, Bobo]

Move two to back: [Sam, Ari, Lucy, Bobo]
Two moved: [Lucy, Bobo, Sam, Ari]

Remove one: [Lucy, Bobo, Sam, Ari]
One removed: [Bobo, Sam, Ari]

Move two to back: [Bobo, Sam, Ari]
Two moved: [Ari, Bobo, Sam]

Remove one: [Ari, Bobo, Sam]
One removed: [Bobo, Sam]

Move two to back: [Bobo, Sam]
Two moved: [Bobo, Sam]

Remove one: [Bobo, Sam]
One removed: [Sam]

Move two to back: [Sam]
Two moved: [Sam]

Remove one: [Sam]
One removed: []

BUILD SUCCESSFUL (total time: 0 seconds)
----------------------------
*/