/*
 * By:     Matthew Fischer
 * Date:   
 */
package pin_pan;

/**
 *
 * @author Matthew Fischer
 */
public class Pin_Pan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        String line = "pin pan pin pa";
        System.out.println( checkPair(line) );
        System.out.println(line.length());
        
    }
    
    // -----method check --------
    public static boolean checkPair(String line){
        // lowercase string
        line = line.toLowerCase();
        
        
        int pin = 0;
        int pan = 0;
        for(int i = 0; i < line.length()-2; i++){
            // first word check
            if(line.charAt(i) == 'p' && line.charAt(i+1) == 'i' & line.charAt(i+2) == 'n'){
                pin++;
                
            }
            // second word pair
            else if( line.charAt(i) == 'p' && line.charAt(i+1) == 'a' & line.charAt(i+2) == 'n'){
                pan++;
            }
           
        }
        if(pin == pan)
            return true;
        else
            return false;
        
    }
    
}
