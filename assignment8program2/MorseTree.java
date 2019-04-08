/*
 * By:     Matthew Fischer
 * Date:   04/05/2019
 */
package assignment8program2;

public final class MorseTree {

    // Data members
    public Node root;
    public final static char dot = '.';
    public final static char dash = '-';
    // constructor
    public MorseTree() {
        
        // the root starts pointing to null
        root = new Node();

    }

    // ---------------Methods-------------------
    // Insert Node
    public void insertNode(char letter, String mCode){
        Node temp = root;
        Node addEmptyNode = null;
        
        // read mCode insert new nodes
        for(int i = 0; i < mCode.length(); i++){
            
            // left
            if(mCode.charAt(i) == dot){
                // No left child
                if(temp.left == null){
                    addEmptyNode = new Node();
                    temp.left = addEmptyNode;
                }
                temp = temp.left; // move marker left

            }
            // right
            else if(mCode.charAt(i) == dash){
                // No right child
                if(temp.right == null){
                    addEmptyNode = new Node();
                    temp.right = addEmptyNode;
                }
                temp = temp.right;// move marker right
            }
            else{
                System.out.println("mcode symbol error");
            }
        }
        
        // add new node
        temp.letter = letter;
    }
    
    // Decode String
    public String decodeMCode(String mCodeSentence){
        String decodedStr = "";
        Node pointer = root;
        
        // decode characters to get a word
        for(int i = 0; i < mCodeSentence.length(); i++){
            // char dot
            if(mCodeSentence.charAt(i) == dot){
                pointer = pointer.left;
            }
            // char dash
            else if(mCodeSentence.charAt(i) == dash){
                pointer = pointer.right;
            }
            // word
            else{
                decodedStr += " " + pointer.letter;
                pointer = root;
            }
            
        }
        // last word
        decodedStr += " " + pointer.letter;
        
        // return sentence
        return decodedStr;
    }
    
    // Output Results
    
    
    
    
    // Output full tree
    public void displayInOrder() {
        inOrder(root);
    }
    
    public void inOrder(Node loc) {
        if (loc == null) {
            return;
        } else {
            inOrder(loc.left);
            System.out.print(loc.letter);
            inOrder(loc.right);
           
        }
    }
}