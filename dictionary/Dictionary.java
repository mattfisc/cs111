/*

 * By:     Matthew Fischer
 * Date:   01/15/2019
 * Assignment 1 Program 1

 */
package dictionary;

import java.util.Scanner;
import java.util.Random;

public class Dictionary {


    
    public static void main(String[] args) {
        
        // variables
        String guess = "";
        String word = "";
        String mix = "";
        int num;
        
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        
        
        // Program Objective
        System.out.println("This game scrambles a word and gives the user a "
                + "definition if you need help.");
        
        // Dictionary
        String[][] dictionary = { 
            {"blue","Matt's favorite color"},
            {"paper","Made from a tree and is written on"},
            {"chair","You sit on it"},
            {"oxygen","A molecule you breath it"},
            {"fire","It will burn you"},
            {"keys","It is used to unlock"},
            {"baseball","Is a sport where you hit a ball with a bat"},   
            };


        
        // Game
        while( !"quit".equals(guess) ){
            // instructions
            System.out.println("Guess the scrambled word.\n\t-Type \'hint\' for the word definition. \n\t-Type \'quit\' to exit.");
            num = rnd.nextInt(dictionary.length);
            word = getWord(dictionary,num);
            
            mix = scrambleWord(word);

            System.out.println("The word is " + mix);
            System.out.print("Guess: ");
            
            // Your guess
            guess = in.next();
            
            // Turn to guess
            while( !word.equals(guess) && !guess.equals("quit") ){
                if( !guess.equals(word) )
                    
                    // Get definition
                    if( guess.equals("hint") ){
                        System.out.println("definition: " + hint(dictionary,num));
                        // Ask for new guess
                        System.out.println( "Guess again: " );
                        guess = in.next();
                    }
                    
                    // Wrong guess
                    else{
                        // Ask for new guess
                        System.out.println( "Guess again: " );
                        guess = in.next();
                    }
                
                // Guess correctely
                else {
                    System.out.println("You guessed correctly. You WIN!!!\n");
                    break;
                }

            }
        }
        
        // End of Game Display
        if( guess.equals("quit") )
            System.out.println("Game ended. You Quit.");
        else
            System.out.println("Error end of game error");
        
    }
    
    //----- getWord ----------
    public static String getWord(String[][]dictionary, int index){
        String word  = "";
        
        // get random word
        word = dictionary[index][0];
        
        return word;
    }
    
   
    //----- scrambleWord ----------
    public static String scrambleWord(String word){
        String newWord = "";
        int mix1;
        int mix2;
        Random rnd = new Random();
        
        // string to char array
        char[] scrambleWord = word.toCharArray();
        
        // scramble word
        for(int i = 0; i < scrambleWord.length-1; i++){
            // random number mix
            mix1 = rnd.nextInt( scrambleWord.length );
            
            // get two different random numbers for index swap
            do{
            mix2 = rnd.nextInt( scrambleWord.length );
            
            }while(mix1 == mix2);
            
            // swap letters
            char c = scrambleWord[mix1];
            scrambleWord[mix1] = scrambleWord[mix2];
            scrambleWord[mix2] = c;
            
            // problem here..........
            //.....
           // ...
            newWord = String.valueOf(scrambleWord);

        }

        return newWord;
    }
    
    //----- hint --------
    public static String hint(String[][] dictionary, int index){
        return dictionary[index][1];
    }
    
}

/*
--------------  Output  --------------------------------
run:
This game scrambles a word and gives the user a definition if you need help.
Guess the scrambled word.
	-Type 'hint' for the word definition. 
	-Type 'quit' to exit.
The word is hraic
Guess: asdf
Guess again: 
hint
definition: You sit on it
Guess again: 
chair
Guess the scrambled word.
	-Type 'hint' for the word definition. 
	-Type 'quit' to exit.
The word is exogny
Guess: hint
definition: A molecule you breath it
Guess again: 
hint
definition: A molecule you breath it
Guess again: 
oxygen
Guess the scrambled word.
	-Type 'hint' for the word definition. 
	-Type 'quit' to exit.
The word is iefr
Guess: hint
definition: It will burn you
Guess again: 
quit
Game ended. You Quit.
BUILD SUCCESSFUL (total time: 34 seconds)
---------------------------------------------------------------------
*/
