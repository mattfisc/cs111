/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainrec;

/**
 *
 * @author Matthew Fischer
 */
public class MainRec {

    public static void main(String[] args) {
        
        // Create Shapes
        Rectangle r1 = new Rectangle(6,2);
        Square s1 = new Square(7);
        
        // Display
        System.out.println( "Display Rectangle sides \n\tlength: " + r1.getLength() 
                + " \n\twidth: " + r1.getWidth() );
        System.out.println(r1.getName() + " area: " + r1.area());
        System.out.println(r1.getName() + " perimeter: " + r1.perimeter());
        
        // edit rectangle
        r1.setLength(5);
        r1.setWidth(4.5);
        
        // Display rectangle change
        System.out.println("\nChange sides");
        System.out.println( "Display Rectangle sides \n\tlength: " + r1.getLength() 
                + " \n\twidth: " + r1.getWidth() );
        System.out.println(r1.getName() + " area: " + r1.area());
        System.out.println(r1.getName() + " perimeter: " + r1.perimeter());
        
        // Display square
        System.out.println( "\nDisplay square \n\tSide: " + s1.getLength() );
        System.out.println(s1.getName() + " area: " + s1.area());
        System.out.println(s1.getName() + " perimeter: " + s1.perimeter());
        
        // Edit square
        s1.setLength(2.5);
        
        System.out.println( "\nChange square \n\tSide: " + s1.getLength() );
        System.out.println(s1.getName() + " area: " + s1.area());
        System.out.println(s1.getName() + " perimeter: " + s1.perimeter());
        
        

    }
    
}
