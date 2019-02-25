/*
 * By:     Matthew Fischer
 * Date:   02/24/2019
 */
package assignment5;

/**
 *
 * @author Matthew Fischer
 */

public class Assignment5 {

  
    public static void main(String[] args) {
    
        // Program Objectives
        System.out.println("This program will sort three different ways and "
                + "tell you how fast it takes to sort them in "
                + "minutes/seconds/miliseconds");
        
        
        // Random Array
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length-1; i++)
            arr[i] = (int)(Math.random()* 10000)+1;
        
        // Selection Sort
        System.out.print("Selection Sort:\t");
        StopWatch sw = new StopWatch();
        Sorter.selectionSort(arr);
        System.out.println(sw.toString());
       
        //Random Array
        int[] arr2 = new int[100000];
        for(int i = 0; i < arr2.length-1; i++)
            arr2[i] = (int)(Math.random() * 10000);
        
        // Binary Sort
        System.out.print("Binary Sort/Quick Sort:\t");
        StopWatch sw2 = new StopWatch();
        Sorter.quickSort(arr2,0,arr2.length-1);
        System.out.println(sw2.toString());
        
        //Random Array
        int[] arr1 = new int[100000];
        for(int i = 0; i < arr1.length-1; i++)
            arr1[i] = (int)(Math.random() * 10000);
        
        // Bubble Sort
        System.out.print("Bubble Sort:\t");
        StopWatch sw1 = new StopWatch();
        Sorter.bubbleSort(arr1);
        System.out.println(sw1.toString());
    }
    
}
/*
--------- Build 1 -----------------
run:
This program will sort three different ways and tell you how fast it takes to sort them in minutes/seconds/miliseconds
Selection Sort:	00:10:147
Binary Sort/Quick Sort:	00:00:32
Bubble Sort:	00:29:332
BUILD SUCCESSFUL (total time: 39 seconds)
--------------------------------------
*/