/*
 * By:     Matthew Fischer
 * Date:   02/24/2019
 */
package assignment5;

public class Sorter {
    
    //--------- Selection Sorter --------
    public static void selectionSort(int[] arr){

        // selection sort is find the smallest number and move it to the front
        for(int index1 = 0;index1 < arr.length-1; index1++){
            int smallest = index1;
            for(int i = index1 + 1; i < arr.length; i++){
                if(arr[i] < arr[index1])
                    smallest = i;
            }
            // swap
            int temp = arr[index1];
            arr[index1] = arr[smallest];
            arr[smallest]= temp;
        }  
    }
   
    //----- Bubble Sort -------
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
    
    public static void display(int[] arr){
        // Display
        for(int i = 0; i < arr.length-1; i++){
            if(i % 50 == 0)
                System.out.println("");
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
//------- QuickSort ---------
    public static void quickSort(int[] arr,int first, int last){
        
        if(first >= last)
            return;
        
        
        int pivot = split(arr,first, last);
        quickSort(arr,first, pivot-1);
        quickSort(arr,pivot+1,last);
        
    }
    
    public static int split(int[] arr, int first, int last){
        int pivot = arr[first];
        int left = first;
        int right = last;
        
        do{
            
            // left num less right number
            while(arr[left] <= pivot && left < right){
                left++;
            }
            //
            while(arr[right] > pivot)
                right--;
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        while(left < right);
        
        arr[first] = arr[right];
        arr[right] = pivot;
        return right;
    }
}
