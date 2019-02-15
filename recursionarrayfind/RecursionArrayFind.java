/*
 * By:     Matthew Fischer
 * Date:   
 */
package recursionarrayfind;

/**
 *
 * @author Matthew Fischer
 */
public class RecursionArrayFind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {11,2,5,66,33,11,55,33,11};
        int index = 0;
        int count = count11(arr,index);
        System.out.println("The number of 11's is: " + count);
    }
    
    //----- count11 ------
    public static int count11(int[] arr,int i){
        

        if(i >= arr.length)
            return 0;
        
        return ((arr[i++] == 11) ? 1 : 0) + count11(arr,i);
            
            
        
    }
}
