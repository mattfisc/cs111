/*
 * By:     Matthew Fischer
 * Date:   
 */
package dealinggame;

public class DealingGame{

    public static void main(String[] args) {

        // task 1 Create Deck
        Deck aDeck = new Deck();
        aDeck.populate();

        // Deal Deck
        //while (!aDeck.isEmpty()) {
        //    System.out.println(aDeck.dealCard());
        //}

        // repopulate
        aDeck.populate();
        aDeck.shuffle();

        // Deal Deck
        while (!aDeck.isEmpty()) {
            System.out.println(aDeck.dealCard());
        }
    }
}



