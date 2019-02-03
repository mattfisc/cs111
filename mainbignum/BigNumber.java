/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainbignum;


public class BigNumber {
        
    // Data Members
    private String number;
    
    // constructor
    public BigNumber(String num){
        number = num;
    }
    
    //******* Getters and Setters ********

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
    
    
    //******************* Methods **********************
    
    //---- add -------------
    public void add(BigNumber sec){
        String total = "";
        
        // THIS.NUMBER is longer
        if( this.number.length()-1 > sec.number.length()-1 ){
            // add "0" to sec string
            while( this.number.length()-1 > sec.number.length()-1 )
                sec.setNumber("0" + sec.getNumber());
        }
        else{
            // SEC.NUMBER is longer
            // add "0" to this string
            while( this.number.length()-1 < sec.number.length()-1 )
                this.setNumber("0" + this.getNumber()); 
        }
        
        // ADDITION
        int remainder= 0;
        for(int i = this.getNumber().length() -1; i >= 0; i--){
            
            // Convert string to number
            int thisNum = this.getNumber().charAt(i) - '0';
            int secNum = sec.getNumber().charAt(i) - '0';
            
            
            // Calculate num
            int position;
            
            // Adding last digit
            if(i == 0){
                position = (remainder + thisNum + secNum);
                total = position + total;
            }
            // Adding from right to left
            else{
                position = (remainder + thisNum + secNum) % 10;
                remainder = (remainder + thisNum + secNum) / 10;
                total = position + total;
            }
            
        }
        
        // change BigNumber
        this.setNumber(total);
        
    }
}
