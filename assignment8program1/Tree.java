/*
 * By:     Matthew Fischer
 * Date:   04/05/2019
 */
package assignment8program1;

public class Tree {

    // Data members
    public Node root;

    // constructor
    public Tree() {
        // the root starts pointing to null
        // because tree starts empty
        root = null;

    }
    // *****************************displayInOrder() : Calls the
    // inOrder()****************************

    public void displayInOrder() {
        inOrder(root);
    }

    public int displayCount() {
        return CountNode(root);
    }

    public int displayParents() {
        return singleParent(root);
    }
    // ******************************inOrder()***************************

    public void inOrder(Node loc) {
        if (loc == null) {
            return;
        } else {
            inOrder(loc.left);
            System.out.print(loc.n);
            inOrder(loc.right);
            // loc = loc.right;
        }
    }

    // **************************************************************************
    public void preFix(Node loc) {
        if (loc != null) {
            System.out.print(loc.n);
            preFix(loc.left);
            preFix(loc.right);
        }

    }

    public void postFix(Node loc) {
        if (loc != null) {
            postFix(loc.left);
            postFix(loc.right);
            System.out.print(loc.n);
        }
    }

    public int CountNode(Node loc) {
        if (loc == null) {
            return 0;
        } else {
            return CountNode(loc.right) + CountNode(loc.left) + 1;

        }

    }

    public int singleParent(Node loc) {
        if (loc == null) {
            return 0;
        } else {
            if (loc.right != null && loc.left != null) {
                return 0 + singleParent(loc.right) + singleParent(loc.left);
            } else if (loc.right == null && loc.left == null) {
                return 0 + singleParent(loc.right) + singleParent(loc.left);
            } else if (loc.right == null && loc.left != null) {
                return 1 + singleParent(loc.left);
            } else {
                return 1 + singleParent(loc.right);
            }

        }

    }
    // add node method

    public void addNode(int n) {
        Node temp = new Node(n);

        // scenario 1: empty tree
        if (root == null) {
            root = temp;
        } // scenario 2
        else {
            Node loc = root;
            while (true) {
                // Sub scenario 1: travel to the left side
                if (temp.n < loc.n) {
                    if (loc.left != null) {
                        loc = loc.left;
                    } else {
                        loc.left = temp;
                        break;
                    }
                } // Sub scenario 2: travel to the right side
                else { // if (temp.n > loc.n) {
                    if (loc.right != null) {
                        loc = loc.right;
                    } else {
                        loc.right = temp;
                        break;
                    }
                }

            }
        }

    }

}
