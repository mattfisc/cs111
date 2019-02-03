/*
 * By:     Matthew Fischer
 * Date:   
 */
package digitsum;

/**
 *
 * @author Matthew Fischer
 */
public class DigitSum {


    public static void main(String[] args) {
        String str = "The fries 4 are col5d";
        
        System.out.println(sumDigits(str));
    }
    
    //-------- sumDigits -----------------
    public static int sumDigits(String str){
        int sum = 0;
        
        for(int i = 0; i < str.length()-1; i++){
            char c = str.charAt(i);
//            if( c >= '0' && c <= '9' ){
//                sum += c - '0';
//            }
            if(Character.isDigit(c)){
                
            }

        }
        
        return sum;
    }
    
}
