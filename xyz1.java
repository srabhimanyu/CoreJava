import java.util.*; 
import java.util.concurrent.*; 
  
public class xyz1 { 
  
    // Function to show 
    // TreeMap(SortedMap) constructor example 
    static void Example4thConstructor() 
    { 
        // Creating a SortedMap 
        SortedMap<Integer, String> sorted_map 
            = new ConcurrentSkipListMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        sorted_map.put(10, "Geeks"); 
        sorted_map.put(15, "4"); 
        sorted_map.put(20, "Geeks"); 
        sorted_map.put(25, "Welcomes"); 
        sorted_map.put(30, "You"); 
  
        // Creating the TreeMap using the SortedMap 
        TreeMap<Integer, String> tree_map 
            = new TreeMap<Integer, String>(sorted_map); 
  
        // Displaying the TreeMap 
        System.out.println("TreeMap: "
                           + tree_map); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        System.out.println("TreeMap using "
                           + "TreeMap(SortedMap)"
                           + " constructor:\n"); 
        Example4thConstructor(); 
    } 
} 