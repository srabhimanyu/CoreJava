/*This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.
To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.

It is similar to HashMap, but is synchronised.
Hashtable stores key/value pair in hash table.
In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.

*/
import java.util.*; 
class hashTabledemo { 
    public static void main(String[] arg) 
    { 
        // creating a hash table 
        Hashtable<Integer, String> h = 
                      new Hashtable<Integer, String>(); 
  
        Hashtable<Integer, String> h1 = 
                      new Hashtable<Integer, String>(); 
  
        h.put(3, "Geeks"); 
        h.put(2, "forGeeks"); 
        h.put(1, "isBest"); 
  
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable<Integer, String>)h.clone(); 
  
        // checking clone h1 
        System.out.println("values in clone: " + h1); 
  
        // clear hash table h 
        h.clear(); 
  
        // checking hash table h 
        System.out.println("after clearing: " + h); 
    } 
} 