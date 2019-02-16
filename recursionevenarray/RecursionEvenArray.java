/*
 * By:     Matthew Fischer
 * Date:   
 */
package recursionevenarray;

import java.util.ArrayList;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionEvenArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {2, 4, -2, -4, 5};
        int index = 0;
        
        int count = oddAfterEven(arr,index);
        
        // program objective
        System.out.println("The recursion method check how many even integers have an odd integer in front\n");
        System.out.print("Input: {");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("}\nOutput: " + count);
        
    }
    
    // ------ oddAfterEven ---------
    public static int oddAfterEven(int[] arr, int index){
   
        //base
        if(index >= arr.length)
            return 0;
       
        return((arr[index] % 2 == 0)? 1:0) + oddAfterEven(arr,index+1);
           
    }
    
}
/*
--------- build one ------------------------
run:
The recursion method check how many even integers have an odd integer in front

Input: {1 2 3 4 5 6 7 }
Output: 3
BUILD SUCCESSFUL (total time: 0 seconds)
--------- build two -------------------------
run:
The recursion method check how many even integers have an odd integer in front

Input: {43 55 33 11 77 1 2 }
Output: 1
BUILD SUCCESSFUL (total time: 0 seconds)
---------- build three ---------------------------
run:
The recursion method check how many even integers have an odd integer in front

Input: {2 4 -2 -4 5 }
Output: 4
BUILD SUCCESSFUL (total time: 0 seconds)
---------------------------------------------------
*/