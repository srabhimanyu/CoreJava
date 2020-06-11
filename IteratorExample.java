
import java.util.*;
public class IteratorExample {

public static void main(String args[]) {
	
	ArrayList al=new ArrayList<>();
	LinkedList<Integer> ll=new LinkedList<>();
	
	ll.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	
	ll.add(0,23);
	
	System.out.println(ll);
	ll.remove(0);

	System.out.println(ll);

	ll.removeAll(ll);
	
	Iterator i=ll.iterator();
	
	while(i.hasNext()) {
		
		System.out.print(i.next()+" ");
	}
	
	
	
	
	/*
	al.add("Anurag");
	al.add(23);
	al.addAll(Arrays.asList(2,3,4,56,7,8,9,10));
	al.add('d');
	//System.out.println(al);
	
             Iterator i=al.iterator();

               while(i.hasNext()) {
            	   
            	   System.out.print(i.next()+" ");
               }
	*/
	
} }

