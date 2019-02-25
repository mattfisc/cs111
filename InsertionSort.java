/*
 * By:     Matthew Fischer
 * Date:   
 */
package insertionsort;

/**
 *
 * @author Matthew Fischer
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {7,4,9,2,5,1,3};
        
        // display
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
        
        sort(arr);
        
        // display
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
        
    }
    public static void sort(int[] arr){
        boolean doneSwapping = true;
        // insertion sort
        do{
            doneSwapping = true;
            for(int pass = 1; pass < arr.length; pass++){
                // test pairs
                if(arr[pass-1] > arr[pass]){
                    doneSwapping = false;
                    int temp = arr[pass];
                    arr[pass] = arr[pass-1];
                    arr[pass-1] = temp;
                }
            }
            
            
        }while(!doneSwapping);
    }
}
