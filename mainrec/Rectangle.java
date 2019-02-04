/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainrec;

/**
 *
 * @author Matthew Fischer
 */
public class Rectangle {
    // Data Members
    protected String name;
    protected double length;
    protected double width;
    
    
    // Default Constructor
    public Rectangle(){
        name = "Rectangle";
        length = 1;
        width = 2;
    }
    
    // Explicit Constructor
    public Rectangle(double l, double w){
        name = "Rectangle";
        length = l;
        width = w;
    }
    
    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    //************** Methods ********************8
    
    //-------- area -----------
    public double area(){
        return length * width;
    }
    
    // ------ parameter --------
    public double perimeter(){
        return length * 2 + width * 2;
    }
    
    //------ toString ---------
    public String toString(){
        return "\n" + name + " :" + "\n\tLength : " + length + "\n\tWidth : " + width;
    }
}
