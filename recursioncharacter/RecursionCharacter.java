/*
 * By:     Matthew Fischer
 * Date:   
 */
package recursioncharacter;

import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        
        // Program objectivs
        System.out.println("This program will add a space between every character in a string\n");
        System.out.println("Enter a string: ");
        str = in.nextLine();
        
        // recursion method
        str = addSpace( str );
        
        // output new string 
        System.out.println(str);
    }
    
    // method
    public static String addSpace(String x){
        
        // end
        if( x == null || x.length() <= 1)
            return x;
        
        // loop string
        return ( Character.isLetter(x.charAt(x.length()-1)) && Character.isLetter(x.charAt(x.length()-2)) ) 
                ? addSpace( x.substring(0,x.length()-1 )) + "-" + x.charAt(x.length()-1)
                : addSpace( x.substring(0,x.length()-1 )) + x.charAt(x.length()-1);
   
    }
    
}
/*
-------------------- build 1 -----------------
run:
This program will add a space between every character in a string

Enter a string: 
Matthew Fischer is coolest
M-a-t-t-h-e-w F-i-s-c-h-e-r i-s c-o-o-l-e-s-t
BUILD SUCCESSFUL (total time: 12 seconds)
------------------- build 2 ----------------------
run:
This program will add a space between every character in a string

Enter a string: 
What is this doing and why and am i doing it
W-h-a-t i-s t-h-i-s d-o-i-n-g a-n-d w-h-y a-n-d a-m i d-o-i-n-g i-t
BUILD SUCCESSFUL (total time: 13 seconds)
------------------ build 3
run:
This program will add a space between every character in a string

Enter a string: 
This works really well! Are you impressed?
T-h-i-s w-o-r-k-s r-e-a-l-l-y w-e-l-l! A-r-e y-o-u i-m-p-r-e-s-s-e-d?
BUILD SUCCESSFUL (total time: 30 seconds)
---------------
*/