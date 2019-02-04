/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainbignum;

import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class MainBigNum {

   
    public static void main(String[] args) {
        // Program objectives
        System.out.println("This program makes bigger numbers than " + " integers");
        
        // Scanner instance
        Scanner in = new Scanner(System.in);
        
        // input string of numbers
        System.out.println("Enter a number");
        String num1 = in.next();
        System.out.println("Enter a number");
        String num2 = in.next();
        
        // create objects
        BigNumber x = new BigNumber(num1);
        BigNumber y = new BigNumber(num2);
        
        // display practice
        System.out.println("x = " + x.getNumber());
        System.out.println("y = " + y.getNumber());
        
        // add object
        x.add(y);
        
        
        // display object
        System.out.println("Added BigNumber = " + x.getNumber());
    }
    
}

/*
--------- build one --------------------------------------
run:
This program makes bigger numbers than  integers
Enter a number
999333555999
Enter a number
111111111111
x = 999333555999
y = 111111111111
Added BigNumber = 1110444667110
BUILD SUCCESSFUL (total time: 28 seconds)
--------- build two --------------------------------------
run:
This program makes bigger numbers than  integers
Enter a number
99999999
Enter a number
1
x = 99999999
y = 1
Added BigNumber = 100000000
BUILD SUCCESSFUL (total time: 5 seconds)
-------- build three -------------------------------------
run:
This program makes bigger numbers than  integers
Enter a number
98888888854321
Enter a number
900005
x = 98888888854321
y = 900005
Added BigNumber = 98888889754326
BUILD SUCCESSFUL (total time: 28 seconds)
-----------------------------------------------------------
*/