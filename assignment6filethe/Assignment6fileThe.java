/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6filethe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class Assignment6fileThe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Data members
        File file = new File("C:\\Users\\Matthew Fischer\\Desktop\\NewYork.txt");
        Scanner readFile;
        String word = "";
        int countThe = 0;
        
        // Program Objectives
        System.out.println("This program reads a desktop NewYork file on the "
                + "the desktop and counts the number of the's.");
        
        // Read file
        try{
            readFile = new Scanner(file);
            while( readFile.hasNextLine() ){
                // read word
                word = readFile.nextLine();
                
                System.out.println(word + " ");
                
                // count the's 
                if(word.equals("the"))
                    countThe++;
            }
            
        // Exception
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        finally{
            System.out.println("Finally");
        }
        
        // Display
        System.out.println("number of " + countThe);
    }
    
}
