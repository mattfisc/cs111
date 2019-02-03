/*
 * By:     Matthew Fischer
 * Date:   
 */
package listprac;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matthew Fischer
 */
public class ListPrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "matt is cool this is what i am talking about";
        Scanner in = new Scanner(name);
        
        ArrayList<String> list = new ArrayList<String>();
        
        while(in.hasNext()){
            list.add(in.next());
        }
        list.add(4, "hi");
        list.remove("is");
        list.remove(2);
        
        for(String x : list){
            System.out.print(x + " ");
        }
        
        
        
        if(list.contains("talking")){
            System.out.println("matt is in the list");
        }
        else
            System.out.println("mat is NOT in the list");
    }
    
}
