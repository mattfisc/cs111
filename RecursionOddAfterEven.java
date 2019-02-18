/*
 * By:     Matthew Fischer
 * Program 4
 * Date:   02/18/2019
 */
package recursionevenafterodd;


public class RecursionOddAfterEven {

    
    public static void main(String[] args) {
        int[] arr = new int[6];
        int index = 0;
        
        for(int i = 0; i < arr.length;i++){
            arr[i] = (int)(Math.random()*100)+1;
        }
        
        boolean check = oddAfterEven(arr,index);
        
        // program objective
        System.out.println("The recursion method check how many even integers have an odd integer in front\n");
        System.out.print("Input: {");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("}\nOutput: " + check);
        
    }
    
    // ------ oddAfterEven ---------
    public static boolean oddAfterEven(int[] arr, int index){
       
       
        
        // base index out of bound
        if(index >= arr.length-1)
            return false;
        
        // first num odd
        if(arr[index] % 2 != 0){
            return oddAfterEven(arr,index+1);
        }
        // first num even
        // even follows even
        if(arr[index+1] % 2 == 0)
            return oddAfterEven(arr,index+1);
        
        // if odd follows even
        return true; 
    }
    
}
 
/*
--------------------- build 1 --------------------
run:
The recursion method check how many even integers have an odd integer in front

Input: {47 96 96 31 36 20 }
Output: true
BUILD SUCCESSFUL (total time: 0 seconds)
--------------------- build 2 ------------------
run:
The recursion method check how many even integers have an odd integer in front

Input: {20 60 2 82 86 68 }
Output: false
BUILD SUCCESSFUL (total time: 0 seconds)
--------------------- build 3 ------------------------------
run:
The recursion method check how many even integers have an odd integer in front

Input: {31 71 63 76 23 39 }
Output: true
BUILD SUCCESSFUL (total time: 0 seconds)
-------------------------------------------------
*/