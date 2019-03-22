/*
 * By:     Matthew Fischer
 * Date:   
 */
package fronttoback;

/**
 *
 * @author Matthew Fischer
 */
public class FrontToBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,5,3,2,9};
        arr = fiveToFront(arr);
        
        for(int i : arr)
            System.out.print(i);
    }
    
    
    // method
    public static int[] fiveToFront(int[] arr){
        // create array of fives
        int[] arr5 = new int[arr.length];
        for(int i = 0; i < arr5.length; i++)
            arr5[i] = 5;
        
        // fill array with non 5s
        for(int index1 = arr.length-1, index2 = arr5.length-1; index1 >= 0;index1--){
            if(arr[index1] != 5)
                arr5[index2--] = arr[index1];
           
        }
        return arr5;
    }
    
}
