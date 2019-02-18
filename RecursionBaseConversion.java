/*
 * By:     Matthew Fischer
 * Program 9
 * Date:   02/18/2019
 */
package recursionbaseconversion;

import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionBaseConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Data members
        int base;
        int value;
        String conversion;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a BASE to convert value: ");
        base = in.nextInt();
        System.out.print("Enter a NUMBER to convert: ");
        value = in.nextInt();
        
        conversion = decimalConversion(value,base);
        System.out.println("With a base of " + base + " and a value of " 
                + value + " the new number is " + conversion);
    }
    
    // ------ decimalConversion--------------
    public static String decimalConversion(int value, int base){
        String str = "";
        // Exit terminal ones column
        if( value <= 0 ){
            return str;
        }
        // not first columns
        else{
            if(value < base)
                str += getChar(value % base);
            else
                str+= decimalConversion(value / base,base)  + getChar(value % base);
             
         return str;
        }
    }
    
        // ---------
    public static char getChar(int num){
        
        if(num < 10)
            return (char)(num + '0');
        else
            return (char)(num + '0' + 7);
        
    }
}
