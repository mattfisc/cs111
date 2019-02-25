/*
 * By:     Matthew Fischer
 * Date:   02/24/2019
 */
package program2binarysearch;

/**
 *
 * @author Matthew Fischer
 */
public class BinarySearch {
    
    // Recursive Method
    // Binary Sort
    public static int binarySearch(int[] arr,int leftIndex, int rightIndex, int find){
        int middle = (leftIndex + rightIndex) / 2;
        
        //Termination
        if(arr[middle] == find)
            return middle;
        // Found on right side
        if(arr[middle] > find)
            return binarySearch(arr,leftIndex,middle-1,find);
        // Found on left side
        if(arr[middle] < find)
            return binarySearch(arr,middle+1,rightIndex,find);
        
        return middle;
    }
    
    // Bubble sort
    public static void bubbleSort(int[] arr){
        // Data members
        
        boolean swap = true;
        int temp;
        
        while(swap){
            swap = false;
            // first num
            for(int num1 = 0; num1 < arr.length-1;num1++ ){
                // second num
                for(int num2 = num1 +1; num2 < arr.length; num2++){
                    // if second num is less than first num switch
                    if(arr[num2] < arr[num1]){
                        temp = arr[num1];
                        arr[num1] = arr[num2];
                        arr[num2] = temp;
                        swap = true;
                    }
                }        
            }           
        }
    }
}
