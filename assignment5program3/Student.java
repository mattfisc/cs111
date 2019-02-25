/*
 * By:     Matthew Fischer
 * Date:   02/24/2019
 */
package assignment5program3;

/**
 *
 * @author Matthew Fischer
 */
public class Student {
    private String firstName;
    private String lastName;
    private String degree;
    
    public Student(String f, String l, String d){
        firstName = f;
        lastName = l;
        degree = d;
    }
    
    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
}
