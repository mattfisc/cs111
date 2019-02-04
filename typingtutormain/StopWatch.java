/*
 * By:     Matthew Fischer
 * Date:   01/31/2019
 */
package typingtutormain;



public class StopWatch {
    private long startTime;
    private long elapsedTime;
    
    //-------- start --------
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    //-------- stopping ---------
    public void stop(){
        elapsedTime = System.currentTimeMillis() - startTime;
        
    }
    
    //-------- tostring ---------
    public String toString(){
        //Data Members
        String time = "The current time is : ";
        int minutes;
        int seconds;
        
        minutes = (int)(elapsedTime / 1000) / 60;
        seconds = (int)(elapsedTime / 1000) % 60;
        
        // format time
        time += (minutes < 10)? "0" + minutes: minutes;
        time += " : ";
        time += (seconds < 10)? "0" + seconds: seconds;
        
        return time;
    }
}
