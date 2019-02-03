/*
 * By:     Matthew Fischer
 * Date:   
 */
package evenodd;

/**
 *
 * @author Matthew Fischer
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,1,2,1,2};
        
        arr = evenOdd(arr);
        
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    
    // ------- method ------
    public static int[] evenOdd(int[] arr){
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        
        // split evens and odds
        for(int i = 0, e = 0, o = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even[e] = arr[i];
                e++;
            }
            else{
                odd[o] = arr[i];
                o++;
            }
        }
        
        // combine to one array
        int[] total = new int[arr.length];
        
        // total index
        int i = 0;
        
        // add even array
        for(int e = 0; e < even.length;e++){
            if(even[e] != 0){
                total[i] = even[e];
                i++;
            }
        }
        // add odd array
        for(int o = 0; o < odd.length;o++){
            if(odd[o] != 0){
                total[i] = odd[o];
                i++;
            }
        }

        return total;
    }

    
    
}
