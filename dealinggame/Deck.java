/*
 * By:     Matthew Fischer
 * Date:   
 */
package dealinggame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // Data Members
    private ArrayList<Card> myDeck;
    private int top;

    // Constructor
    public Deck() {
        myDeck = new ArrayList<Card>();
        
    }

    //------ populate ----------
    public void populate() {

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                myDeck.add(new Card(rank, suit));
            }
        }

    }
    
    //-------- shuffle ---------
    public void shuffle(){
        Collections.shuffle(myDeck);
        
    }
    
    //--------- dealCard---------
    public Card dealCard(){
        Card c = myDeck.get(0);
        myDeck.remove(0);
        return c;
    }
    
    //--------- isEmpty ---------
    public boolean isEmpty(){
        return myDeck.isEmpty();
    }
    
    
}