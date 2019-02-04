/*
 * By:     Matthew Fischer
 * Date:   01/31/2019
 */
package typingtutormain;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TextingTutorEngine {
    // Data Members
    private String testSentence;
    
    // Constructor-Default
    public TextingTutorEngine(){
        testSentence = "";
    }
    
   
    //******** Methods ******
    
    //------ setTest -------
    public void setTestSentence(String s){
        testSentence = s;
    }
    
    // ------- start
    public void start()throws Exception{
        
        // create buffered reader for keyboard input
        BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in) );
        String userInput;
        
        // create stopWatch
        StopWatch sW = new StopWatch();
        
        // Tell the user to hit the enter key to begin the test
        System.out.println("Hit \'ENTER\' to begin... ");
        
        // Read the enter key and display the test sentence
        userInput = keyboard.readLine();
        System.out.println("Enter the Sentence: " + testSentence);
        
        // start timer
        sW.start();
        userInput = keyboard.readLine();
        sW.stop();
        
        // Display results
        if( testSentence.equals(userInput) )
            System.out.println("Your time is " + sW.toString() );
        else
            System.out.println("You did NOT type your sentence correctely");
    }
    
    
}
