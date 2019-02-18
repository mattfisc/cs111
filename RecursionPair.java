/*
 * By:     Matthew Fischer
 * Program 3
 * Date:   02/18/2019
 */
package recursionpair;

import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionPair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        
        // Program objectives
        System.out.println("The Program object is to count the number of pairs seperated by a character\n");
        
        System.out.println("Enter a string of pairs");
        str = in.next();
        int count = pairCount(str);
        
        System.out.println("The pair count is: " + count);

    }
    
    // pairCount
    public static int pairCount(String str){
        int count = 0;
        
        // lowercase string
        str = str.toLowerCase();
        
        // end of string
        if(str.length() < 3)
            return count;
        
        // is pair
        else if(str.charAt(0) == str.charAt(2) ){
            count += pairCount(str.substring(1)) + 1;
        }
        
        // not pair
        else
            count = pairCount(str.substring(1));
       
        return count;
    }
}
/*
------------- build 1 ------------------
run:
The Program object is to count the number of pairs seperated by a character

Enter a string of pairs
xyxyxy
The pair count is: 4
BUILD SUCCESSFUL (total time: 21 seconds)
------------- build 2 ------------------------
run:
The Program object is to count the number of pairs seperated by a character

Enter a string of pairs
xyzxyzz
The pair count is: 0
BUILD SUCCESSFUL (total time: 17 seconds)

------------ build 3 ----------------------------
run:
The Program object is to count the number of pairs seperated by a character

Enter a string of pairs
xyxxyxyxy
The pair count is: 5
BUILD SUCCESSFUL (total time: 10 seconds)
-------------------------------------------------
*/