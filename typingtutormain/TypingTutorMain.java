/*
 * By:     Matthew Fischer
 * Date:   01/31/2019
 */
package typingtutormain;

public class TypingTutorMain {

    
    public static void main(String[] args) throws Exception{
        
        TextingTutorEngine tutor = new TextingTutorEngine();
        tutor.setTestSentence("I like cold french fries, Aya!");

        tutor.start();
    }
    
}

/*
----- build one -----------------------------------
run:
Hit 'ENTER' to begin... 

Enter the Sentence: I like cold french fries, Aya!
I like cold french fries, Aya!
Your time is The current time is : 00 : 11
BUILD SUCCESSFUL (total time: 13 seconds)
------ build two ----------------------------------
run:
Hit 'ENTER' to begin... 

Enter the Sentence: I like cold french fries, Aya!
i like fosdfa asdf
You did NOT type your sentence correctely
BUILD SUCCESSFUL (total time: 4 seconds)
---------------------------------------------------
*/