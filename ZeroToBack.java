/*
 * By:     Matthew Fischer
 * Date:   
 */
package ZeroToBack;

/**
 *
 * @author Matthew Fischer
 */
public class ZeroToBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create array
        int[] arr = {1,0,3,4,0,9,0,0,7,4};
        
        
        // arrange array
        
        int[] newArr = new int[arr.length];
        
        for(int index = 0, newI = 0; index < newArr.length; index++ ){
            
            // if not zero
            if(arr[index] != 0){
                newArr[newI] = arr[index];
                newI++;
            }
        }
        
        // display array
        for(int x : newArr){
            System.out.print(x + " ");
        }
        
    }
    
}
