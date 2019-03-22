/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6program6studentnode;

import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class Assignment6Program6StudentNode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program makes a node list for students name "
                + "and score and displays them in order of score");
        
        LinkedList studentList = new LinkedList();
        //ADD STUDENTS TO THE LIST
        studentList.addNodeInOrder("Roger", "Baca", 70);
        studentList.addNodeInOrder("Suzy", "Davis", 98);
        studentList.addNodeInOrder("Bobo", "Green", 50);
        studentList.addNodeInOrder("Cat", "Ling", 85);
        studentList.addNodeInOrder("Ken", "Molich", 99);
        
        studentList.displayNodes(studentList.head);
        
        
        
        
        // find a name
        System.out.println("Enter a name to find");
        Scanner in = new Scanner(System.in);
        String find = in.next();
        
        // output results of find
        System.out.println(find + "'s score " + studentList.findNameInNonOrderList(find) );
        
    }
    
}
/*
----------- build 1 ---------------
run:
This program makes a node list for students name and score and displays them 
in order of score
Bobo Green scored 50
Roger Baca scored 70
Cat Ling scored 85
Suzy Davis scored 98
Ken Molich scored 99
BUILD SUCCESSFUL (total time: 0 seconds)
----------------------------------------------
*/