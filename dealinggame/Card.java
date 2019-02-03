/*
 * By:     Matthew Fischer
 * Date:   
 */
package dealinggame;

public class Card {
    // Data Members
    private int rank;
    private int suit;
    private boolean isFaceUp;

    // Explicit Constructor
    public Card(int r, int s) {
        rank = r;
        suit = s;
        isFaceUp = false;
    }

    // Setters and Getters

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
    }

    // Functionality

    public String toString() {
        String value = "";

        switch (rank) {
        case 13:
            value += "KING";
            break;
        case 12:
            value += "QUEEN";
            break;
        case 11:
            value += "JACK";
            break;
        case 10:
            value += "10";
            break;
        case 9:
            value += "9";
            break;
        case 8:
            value += "8";
            break;
        case 7:
            value += "7";
            break;
        case 6:
            value += "6";
            break;
        case 5:
            value += "5";
            break;
        case 4:
            value += "4";
            break;
        case 3:
            value += "3";
            break;
        case 2:
            value += "2";
            break;
        case 1:
            value += "ACE";
            break;
        default:
            System.out.println("Error in ToString");

        }
        
        // suit
        switch(suit){
            case 1:
                value += " OF SPADES";
                break;
            case 2:
                value += " OF DIAMONDS";
                break;
            case 3:
                value += " OF CLUBS";
                break;
            case 4:
                value += " OF HEARTS";
                break;
        }
        
        return value;
    }

    public int value() {
        return (rank >= 10) ? 10 : rank;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

}
