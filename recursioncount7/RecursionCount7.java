/*
 * By:     Matthew Fischer
 * Date:   
 */
package recursioncount7;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionCount7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1277777377;
        
        x = countSevens(x);
        
        System.out.println("The number of sevens is: " + x);
    }
    
    // ------ countSevens -----------
    public static int countSevens(int x){
        
        if(x < 7)
            return 0;
        
        return ((x % 10 == 7) ? 1 : 0) + countSevens(x / 10);
        
    }
        
}
