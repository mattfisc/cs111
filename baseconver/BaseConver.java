/*
 * By:     Matthew Fischer
 * Date:   
 */
package baseconver;

/**
 *
 * @author Matthew Fischer
 */
public class BaseConver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 42;
        int base = 16;
        
        convert(num,base);
        System.out.println("The conversion is " + convert(num,base));
    }
    
    //----------- convert ---------
    public static String convert(int num, int base){
        // termination
        if(num <= 0){
            return "";
        }
        // convert by base
        else{
            // ones column
            if(num < base)
                return "" + getChar(num%base);
            // next column til end of num
            else
                return "" + convert(num/base,base) + getChar(num%base);
        }
    }
    
    // --------- getChar ---------
    public static String getChar(int value){
        // return value
        if(value < 10)
            return "" + (value);
        // return value if base is over 9
        else
            return "" + (char)(value + '0' + 7);
    }
}
