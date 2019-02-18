/*
 * By:     Matthew Fischer
 * Date:   
 */
package recursionoddeven;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionOddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 5;
        
        int count = countEyes(num);
        
        System.out.println("The number of eyes is: " + count);
        
    }
    
    
    // ---- countEyes -------
    public static int countEyes(int num){
        // Data Member
        int count = 0; 
        
        if(num <= 0)
            return count;
        return ((num % 2 == 0) ? 3 : 2) + countEyes(num-1);
        
    }
}
