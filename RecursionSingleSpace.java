/*
 * By:     Matthew Fischer
 * Program 7
 * Date:   02/18/2019
 */
package recursionsinglespace;

import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionSingleSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Data members
        Scanner in = new Scanner(System.in);
        String str;
        
        // Program objectives
        System.out.println("This program will remove double spaces from a string");
        
        
        System.out.println("Enter a string");
        str = in.nextLine();
        
        str = removeDoubleSpace(str);
        
        System.out.println(str);
        
    }
    
    // removeDoubleSpace(str)
    public static String removeDoubleSpace(String str){
        // base
        if(str.length() <= 1){
            return str;
        }
        // double space
        else if( Character.isWhitespace( str.charAt(0) ) && Character.isWhitespace( str.charAt(1) ) ){
            str = removeDoubleSpace(str.substring(1));
        }
        else{
            str = str.charAt(0) + removeDoubleSpace( str.substring(1) );
        }
        return str;
    }
}
