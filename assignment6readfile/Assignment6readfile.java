/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class Assignment6readfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Data members
        File file = new File("C:\\Users\\Matthew Fischer\\Desktop\\Breakfast.txt");
        Scanner readFile;
        String word = "";
        int count = 0;
        
        // Program objects
        System.out.println("This program uses program 1's file on desktop named"
                + "Breakfast and counts the words that end in a vowel or s.");
        
        // Read file
        try{
            readFile = new Scanner(file);
            while( readFile.hasNext() ){
                word = readFile.next();
                if( word.charAt(word.length()-1) == 's' || 
                         word.charAt(word.length()-1) == 'a' || 
                         word.charAt(word.length()-1) == 'e' || 
                         word.charAt(word.length()-1) == 'i' || 
                         word.charAt(word.length()-1) == 'o' || 
                         word.charAt(word.length()-1) == 'u' )
                    count++;
            }
            
        // Exception
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        
        // Display
        System.out.println("The number of words ending in 's' or a vowel count: " + count);     
    }
}
/*
--------- build 1 --------------
run:
This program uses program 1's file on desktop namedBreakfast and counts the words that end in a vowel or s.
The number of words ending in 's' or a vowel count: 4
BUILD SUCCESSFUL (total time: 0 seconds)
---------- text file read from on desktop ----------------

// FILE TO DESKTOP
bacon
eggs
hashbrowns
mc muffin
apple juice

*/