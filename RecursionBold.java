/*
 * By:     Matthew Fischer
 * Date:   
 */
package recursionbold;

import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionBold {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Data members
        String str;
        Scanner in = new Scanner(System.in);
        int count;
        
        // Program objectives
        System.out.println("This program will count the number of characters  for bold HTML tag\n");
        System.out.print("Enter a sentence: ");
        str = "<b>" + in.nextLine() + "</b>";
        System.out.println("Input:\t" + str);
        
        count = characterCount(str);
        
        System.out.println("Output:\t"+ count);
        
    }
    
    // -------- characterCount --------
    public static int characterCount(String str){
        int count = 0;
        
        if(str.length() <= 0 || str == null)
            return count;
        
        count += characterCount(str.substring(1))+ 1;
        
        return count;
    }
}
