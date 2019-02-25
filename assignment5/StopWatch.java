/*
 * By:     Matthew Fischer
 * Date:   02/24/2019
 */
package assignment5;


public class StopWatch {
    private long start;
    private long timeLapse;
    
    // constructor
    public StopWatch(){
        start = System.currentTimeMillis();
    }
    
    // get time
    public String toString(){
        String str = "";
        
        timeLapse = (System.currentTimeMillis() - start);
        
        int milSeconds = (int)timeLapse % 1000;
        int seconds = (int)(timeLapse / 1000) % 60;
        int minutes = (int)(timeLapse / 1000) / 60;
        
        
        // if in single digits
        str += (minutes < 10)?"0"+minutes:minutes;
        str += ":";
        str += (seconds < 10)?"0"+seconds:seconds;
        str += ":";
        str += (milSeconds < 10)?"0"+milSeconds:milSeconds;

        return str;
    }
}
