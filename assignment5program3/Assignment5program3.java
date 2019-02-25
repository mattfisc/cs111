/*
 * By:     Matthew Fischer
 * Date:   02/24/2019
 */

package assignment5program3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class Assignment5program3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Data Member
        ArrayList<Student> std = new ArrayList<Student>();
        File inputFile;
        Scanner readFile = null;
        PrintWriter pw = null;

        // Program Objectives
        System.out.println("This program will write and read from a file, "
                + "and organize the information to a ArrayList of Objects");
        
        
        File file = new File("C:\\Users\\Matthew Fischer\\Documents\\NetBeansProjects\\Assignment5program3\\student-degree.txt");
        

        // Read File
        try{     
            // create scanner for file
            readFile = new Scanner(file);
            while(readFile.hasNext())
                std.add( new Student(readFile.next(),readFile.nextLine(),
                        readFile.nextLine()) );
            
        }
        catch(FileNotFoundException a){
            System.out.println("Cant read from file");
        }
        
        // Display all students
        System.out.println("Data read from file");
        for(int i = 0; i < std.size(); i++){
            System.out.println(std.get(i).getFirstName() + " " 
                    + std.get(i).getLastName() + " : " 
                    + std.get(i).getDegree());
        }
        System.out.println("");
        
        // Organize list by longest name
        Student temp;
        for(int first = 0, lengthF = 0, lengthS = 0; first < std.size()-1; first++){
            for(int second = first + 1; second < std.size(); second++){
                // get full name string length
                lengthF = std.get(first).getFirstName().length()-1
                    + std.get(first).getLastName().length()-1;
                lengthS = std.get(second).getFirstName().length()-1
                    + std.get(second).getLastName().length()-1;
                
                // compare length
                // organize longest to shortest
                if(lengthS > lengthF){
                    temp = std.get(second);
                    std.set(second, std.get(first));
                    std.set(first, temp);
                }
            }
        }
        
        // Display all students
        System.out.println("Data organized length of name, longest to shortest");
        for(int i = 0; i < std.size(); i++){
            System.out.println(std.get(i).getFirstName() + " " 
                    + std.get(i).getLastName() + " : " 
                    + std.get(i).getDegree());
        }
    }
    
}
/*
------------ Build 1 ---------------------
run:
This program will write and read from a file, and organize the information to a ArrayList of Objects
Data read from file
James  Baca : Computer Science
Julia  Swetson : History
Tilda  Pravishtar : Chemistry
James  Baker : Biology
Roger  Childs : English Studies

Data organized length of name, longest to shortest
Tilda  Pravishtar : Chemistry
Julia  Swetson : History
Roger  Childs : English Studies
James  Baker : Biology
James  Baca : Computer Science
BUILD SUCCESSFUL (total time: 0 seconds)
-----------------------------------------------------
*/
