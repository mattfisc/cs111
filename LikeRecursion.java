/*
 * By:     Matthew Fischer
 * Date:   
 */
package likerecursion;

/**
 *
 * @author Matthew Fischer
 */
public class LikeRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // String
        String str = "I !like grapes and I like apples";
        
        // method recurrsion
        int count = likeCount(str);
        
        
        // output count of like
        System.out.println(count);
         
    }
    
    //**** likeCount ******
    public static int likeCount(String str){
        int count = 0;
 
        // end
        if( str.lastIndexOf("like") == -1 )
            return count;
       
        // repeat
            // if not like
        if(str.charAt(str.lastIndexOf("like")-1) == '!')
            count = likeCount( str.substring(0,str.lastIndexOf("like") - 1));
        else
            // if like +1
            count = likeCount( str.substring(0,str.lastIndexOf("like") - 1)) +1;
        
        return count;
    }
    
}
