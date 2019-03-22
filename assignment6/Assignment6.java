/*
 * By:     Matthew Fischer
 * Date:   03/18/2019
 */
package assignment6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class Assignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Objectives
        System.out.println("This program writes a file to the desktop");
        
        // Data Members
        File newFile = null;
        PrintWriter pw = null;
        
        // Create File
        try{
            newFile = new File("C:\\Users\\Matthew Fischer\\Desktop\\breakfast.txt");
            pw = new PrintWriter(newFile);
            pw.println("bacon\n");
            pw.println("eggs\n");
            pw.println("hashbrowns\n");
            pw.println("mc muffin\n");
            pw.println("apple juice\n");
            
        }catch(Exception e){
            System.out.println("File not created");
        }
        finally{
            if(newFile != null)
                pw.close();
        }
    }
}
/*
----------- build 1 ---------------------
run:
This program writes a file to the desktop
BUILD SUCCESSFUL (total time: 0 seconds)

// FILE TO DESKTOP
bacon
eggs
hashbrowns
mc muffin
apple juice

*/