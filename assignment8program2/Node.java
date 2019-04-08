/*
 * By:     Matthew Fischer
 * Date:   04/05/2019
 */
package assignment8program2;

public class Node {
    // Data members

    public char letter;
    public Node left;
    public Node right;

    // class constructor: explicit
    public Node() {
        this.letter = '\0';
        left = null;
        right = null;
    }

}