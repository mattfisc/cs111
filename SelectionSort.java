/*
 * By:     Matthew Fischer
 * Date:   
 */
package selectionsort;

/**
 *
 * @author Matthew Fischer
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arr = {7,4,9,2,5,1,3};
        
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
        
        sort(arr);
        
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    public static void sort(int[] arr){
        
        for(int pass = 0;pass < arr.length-1; pass++){
            int smallest = pass;
            for(int i = pass + 1; i < arr.length; i++){
                if(arr[i] < arr[smallest])
                    smallest = i;
            }
            // swap
            int temp = arr[pass];
            arr[pass] = arr[smallest];
            arr[smallest]= temp;
        }
        
    }
}
