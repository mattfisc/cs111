/*
 * By:     Matthew Fischer
 * Date:   02/24/2019
 */
package program2binarysearch;

/**
 *
 * @author Matthew Fischer
 */
public class Program2BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Program Objectives
        System.out.println("This program displays an Array before and after "
                + "sorting and finds a number and tells you the index");
        
        // array of 16 int
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        

        // Display array
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println("");
        
        // Binary Search for number 10
        int find = 10;
        
        // Binary Search Method
        int index = BinarySearch.binarySearch(arr,0,arr.length-1,find);
        
        // If number is not in array
        if(index == -1)
            System.out.println("Number not found");
        else
            System.out.println(find + " is at index " + index);

    }
    
}
/*
------------ build 1 -----------------
run:
This program displays an Array before and after sorting and finds a number and tells you the index
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
10 is at index 9
BUILD SUCCESSFUL (total time: 0 seconds)
--------------------------------------
*/