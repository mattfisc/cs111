/*
 * By:     Matthew Fischer
 * Date:   01/22/2019
 */
package fractionmain;


public class Fraction {
    
    // Data Members
    private int num;
    private int den;
    
    public Fraction(){
        num = 0;
        den = 1;
    }
    
    //Explicit Constructor
    public Fraction(int n, int d){
        num = n;
        den = d;
    }
    
    //Getters and Setters

    public int getNum() {
        return num;
    }

    public void setNum(int numerator) {
        this.num = numerator;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int denominator) {
        this.den = denominator;
    }
    
    //---- Method Functions --------
    
    // ----- add --------
    public void add(Fraction f){

        // adjust numerators and add numerator
        this.num = (this.num * f.den) + (f.num * this.den);
        
        // find common denominator
        this.den = this.den * f.den;
           
    }
    
    //---- subtract --------
    public void subtract(Fraction f){
        // adjust numerators and subtract numerator
        this.num = (this.num * f.den) - (f.num * this.den);
        
        // find common denominator
        this.den *= f.den;
        
        
    }
    
    //---- multiply --------
    public void multiply(Fraction f){
        // multiply numerator
        this.num *= f.num;
        
        // mutliply denominator
        this.den *= f.den;
       
    }
    
    //---- divide --------
    public void divide(Fraction f){
        // invert second fraction
        int temp = f.num;
        f.num = f.den;
        f.den = temp;
        
        // multiply numerator
        this.num *= f.num;
        
        // mutliply denominator
        this.den *= f.den;
       
        
    }
    
    //---- reduce --------
    public void reduce(){
        // find divisible number in den and num
        for(int i = 1; i < 9; i++){
            if(this.num % i == 0 && this.den % i == 0){
                this.num /= i;
                this.den /= i;
            }
        }
        
    }
    
    // ----- isEqual -------
    public boolean isEqual(Fraction f){
        boolean isTrue = false;
        
        // reduce both
        
        // reduce this Fraction
        for(int i = 1; i < 9; i++){
            if(this.num % i == 0 && this.den % i == 0){
                this.num /= i;
                this.den /= i;
            }
        }
        
        // reduce f Fraction
        for(int i = 1; i < 9; i++){
            if(this.num % i == 0 && this.den % i == 0){
                f.num /= i;
                f.den /= i;
            }
        }
        
        // isEqual
        if(this.num == f.num && this.den == f.den){
            isTrue = true;
        }
        
        return isTrue;
    }
    
    // ----- toString ---------
    @Override
    public String toString(){
        String str = "";
        
        // add numerator to string
        int temp = this.num;
        str += temp + "/";
        // add denonminator to string
        temp = this.den;
        str += temp;
        
        return str;
    }
    
}
