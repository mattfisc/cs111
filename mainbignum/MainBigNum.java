/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainbignum;

/**
 *
 * @author Matthew Fischer
 */
public class MainBigNum {

   
    public static void main(String[] args) {
        // Program objectives
        System.out.println("This program makes bigger numbers than " + " integers");

        // create objects
        BigNumber x = new BigNumber("23456778999");
        BigNumber y = new BigNumber("1");
        
        // display practice
        System.out.println("x = " + x.getNumber());
        System.out.println("y = " + y.getNumber());
        
        // add object
        x.add(y);
        
        
        // display object
        System.out.println("Added BigNumber = " + x.getNumber());
    }
    
}
