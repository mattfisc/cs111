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
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(6,2);
        Square s1 = new Square();
        Square s2 = new Square(7);
  
        // Display
        System.out.println(r1.toString());
        System.out.println("The area is: " + r1.area());
        System.out.println("The perimeter is: " + r1.area());
        
        System.out.println(r2.toString());
        System.out.println("The area is: " + r2.area());
        System.out.println("The perimeter is: " + r2.area());
        
        System.out.println(s1.toString());
        System.out.println("The area is: " + s1.area());
        System.out.println("The perimeter is: " + s1.area());
        
        System.out.println(s2.toString());
        System.out.println("The area is: " + s2.area());
        System.out.println("The perimeter is: " + s2.area());
        
        // Edit rectangle
        System.out.println("Change sides of rectangle 1 and square 1");
        r1.setLength(5);
        r1.setWidth(4.5);
        // Edit square
        s1.setLength(2.5);
        
        // Display
        System.out.println(r1.toString());
        System.out.println("The area is: " + r1.area());
        System.out.println("The perimeter is: " + r1.area());
        
        System.out.println(s1.toString());
        System.out.println("The area is: " + s1.area());
        System.out.println("The perimeter is: " + s1.area());

        
        

    }
    
}

/*
--------- build one----------------------------------
run:

Rectangle :
	Length : 1.0
	Width : 2.0
The area is: 2.0
The perimeter is: 2.0

Rectangle :
	Length : 6.0
	Width : 2.0
The area is: 12.0
The perimeter is: 12.0

Square :
	Length : 1.0
	Width : 1.0
The area is: 1.0
The perimeter is: 1.0

Square :
	Length : 7.0
	Width : 7.0
The area is: 49.0
The perimeter is: 49.0
Change sides of rectangle 1 and square 1

Rectangle :
	Length : 5.0
	Width : 4.5
The area is: 22.5
The perimeter is: 22.5

Square :
	Length : 2.5
	Width : 1.0
The area is: 6.25
The perimeter is: 6.25
BUILD SUCCESSFUL (total time: 0 seconds)
-------------------------------------------------------------
*/