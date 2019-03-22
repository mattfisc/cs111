/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6program5nodes;

/**
 *
 * @author Matthew Fischer
 */
public class Assignment6Program5Nodes {

    public static void main(String[] args) {
        System.out.println("This program will create a node list and modify "
                + "the list and display the changes");
        
        LinkedList linkedList = new LinkedList();

        // insert node
        linkedList.addNextNode(3);
        linkedList.addNextNode(4);
        linkedList.addNextNode(5);
        linkedList.addNextNode(6);
        linkedList.addNextNode(7);
        linkedList.addNextNode(8);
        linkedList.addNextNode(9);
        linkedList.addNextNode(1);
        linkedList.addNextNode(2);
        linkedList.addNextNode(3);
        
        // display nodes
        System.out.print("linked list of numbers: ");
        linkedList.displayNodes(linkedList.head);
        System.out.println("");
        
        // display every other node
        System.out.print("Display every other node in the list: ");
        linkedList.displayEveryOtherNode(linkedList.head);
        System.out.println("");
        
        // delete odd nodes
        LinkedList linkedList2 = new LinkedList();
        linkedList2 = linkedList.deleteOddNodes(linkedList.head);
        
        System.out.print("Display all even nodes: ");
        // display every other node
        linkedList2.displayNodes(linkedList2.head);
        System.out.println("");
        
    }
    
}
/*
--------- build 1 ------------
run:
linked list of numbers: [3, 4, 5, 6, 7, 8, 9, 1, 2, 3]
Display every other node in the list: 3, 5, 7, 9, 2
Display all even nodes: [4, 6, 8, 2]
BUILD SUCCESSFUL (total time: 0 seconds)
---------------------------------
*/