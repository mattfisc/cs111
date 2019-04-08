/*
 * By:     Matthew Fischer
 * Date:   04/05/2019
 */
package assignment8program2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Assignment8Program2 {

    public static void main(String[] args) {
        MorseTree tree = new MorseTree();
        File file = new File("morseText.txt");
        Scanner readFromFile = null;
        String getNewNode = "";
        
        char newChar = '\0';
        String mCode = "";
        
        
        try{
            readFromFile = new Scanner(file);
            
            // read line
            while( readFromFile.hasNextLine() ){
                newChar = readFromFile.next().charAt(0);
                mCode = readFromFile.next();
                
                // insert into Morse Tree
                tree.insertNode(newChar,mCode);
            }
            
        }catch(IOException e){
            System.out.println("File not found");
        }
        
        // translate
        String str1 = "-- .- - - / .. ... / - .... . / -.-. --- --- .-..";
        String str2 = ".. / - .-. -.-- / - --- / .-- --- .-. -.- / --- ..- - / "
                + ". ...- . .-. -.-- -.. .- -.--";
        String str3 = ".. / ..-. --- .-. --. --- - / - --- / . .- - / -... .-. "
                + ". .- -.- ..-. .- ... - / - --- -.. .- -.--";
        String str4 = "... - ..- -.. -.-- / . ...- . .-. -.-- / -.. .- -.-- / "
                + "..-. --- .-. / .--. .-. --- --. .-. .- -- -- .. -. --.";
        System.out.println(tree.decodeMCode(str1));
        System.out.println(tree.decodeMCode(str2));
        System.out.println(tree.decodeMCode(str3));
        System.out.println(tree.decodeMCode(str4));
    }
    
}
