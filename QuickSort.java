/*
 * By:     Matthew Fischer
 * Date:   
 */
package quicksort;

/**
 *
 * @author Matthew Fischer
 */
public class QuickSort {

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
        
        sort(arr, 0, arr.length-1);
        
        // display
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
        
    }
    public static void sort(int[] arr,int first, int last){
        if(first >= last)
            return;
        int pivot = split(arr,first, last);
        sort(arr,first, pivot-1);
        sort(arr,pivot+1,last);
    }
    
    public static int split(int[] arr, int first, int last){
        int pivot = arr[first];
        int left = first;
        int right = last;
        do{
            while(arr[left] <= pivot && left < right){
                left++;
            }
            while(arr[right] > pivot)
                right--;
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }while(left < right);
        arr[first] = arr[right];
        arr[right] = pivot;
        return right;
    }
}
