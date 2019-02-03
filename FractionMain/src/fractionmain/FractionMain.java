/*
 * By:     Matthew Fischer
 * Date:   01/22/2019
 */
package fractionmain;

/**
 *
 * @author Matthew Fischer
 */
public class FractionMain {

    public static void main(String[] args) {

        System.out.println("Test Application for the Fraction class");

        // INSTANTIATE ELEVEN FRACTION OBJECTS.
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(2, 7);
        Fraction f3 = new Fraction(4, 15);
        Fraction f4 = new Fraction(2, 3);
        Fraction f5 = new Fraction(5, 8);
        Fraction f6 = new Fraction(3, 10);
        Fraction f7 = new Fraction(1, 8);
        Fraction f8 = new Fraction(3, 8);
        Fraction f9 = new Fraction(3, 18);
        Fraction f10 = new Fraction(4, 7);
        Fraction f11 = new Fraction(8, 14);

        // TASK 1: DISPLAY f1, INSTANTIATED BY THE DEFAULT CONSTRUCTOR
        System.out.println("1) f1 = " + f1.toString() + "  (default constructor)");
       
        // TASK 2: RESET FRACTION f1 AND REDISPLAY IT
        f1.setNum(3);
        f1.setDen(5);
        System.out.println("2) f1 = " + f1.toString() + "  (modified)");

        // TASK 3: ADD FRACTION f2 TO f1
        System.out.print("3) " + f1.toString() + "  +  " + f2.toString() + " = ");
        f1.add(f2);
        System.out.println(f1.toString());

        // TASK 4: SUBTRACT f4 FROM f3
        System.out.print("4) " + f3.toString() + " - " + f4.toString() + " = ");
        f3.subtract(f4);
        System.out.println(f3.toString());

        // TASK 5: MULTIPLY FRACTION f5 BY f6
        System.out.print("5) " + f5.toString() + " * " + f6.toString() + " = ");
        f5.multiply(f6);
        System.out.println(f5.toString());

        // TASK 6: DIVIDE FRACTION f7 BY f8
        System.out.print("6) " + f7.toString() + " " + ((char) 247) + " " + f8.toString() + " = ");
        f7.divide(f8);
        System.out.println(f7.toString());

        // TASK 7: REDUCE FRACTION f9
        System.out.print("7) The fraction " + f9.toString() + " can be reduced to ");
        f9.reduce();
        System.out.println(f9.toString());

        // TASK 8: COMPARE FRACTIONS f10 and f11
        System.out.print("8) " + f10.toString() + " == " + f2.toString() + ": " + f10.isEqual(f11) + "\n");
      }

    
}
/*
--------------------- build one ---------------------------
run:
Test Application for the Fraction class
1) f1 = 0/1  (default constructor)
2) f1 = 3/5  (modified)
3) 3/5  +  2/7 = 31/35
4) 4/15 - 2/3 = -18/45
5) 5/8 * 3/10 = 15/80
6) 1/8 ÷ 3/8 = 8/24
7) The fraction 3/18 can be reduced to 1/6
8) 4/7 == 2/7: false
BUILD SUCCESSFUL (total time: 0 seconds)
-----------------------------------------------
*/