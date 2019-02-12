/*
 * By:     Matthew Fischer
 * Date:   
 */
package recursioncharacter;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "apples19";
        
        str = addSpace( str );
        
        System.out.println(str);
    }
    
    // method
    public static String addSpace(String x){
        
        // end loop
        if( x == null || x.length() <= 0)
            return x;
        
        // loop string from end to begining
        return addSpace( x.substring(0,x.length()-1 )) + " " + x.charAt(x.length()-1) ;
   
    }
    
}
