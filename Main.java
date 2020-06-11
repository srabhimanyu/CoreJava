import java.io.*;
import java.util.ArrayList;
import java.util.Iterator; // Iterator
import java.util.TreeSet; // TreeSet
public class Main {
	
	public static void main(String args[]) {
	/*	TreeSet<String> ts=new TreeSet<>();
		ts.add("Suresh");
		ts.add("Vineet");
		ts.add("Ashish");
		ts.add("Amit");
		ts.add("Vineet");
		
		Iterator i=ts.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		*/
		
		ArrayList<Number> al=new ArrayList<>();
		al.add(21.5);
		al.add(32L);
		al.add(54.7f);
		al.add(67);
		
		System.out.println("size of Al"+al.size()+"contains"+al.contains(67));
		
		System.out.println("size of al:"+al.isEmpty());
		
		
		
		
	}
	
	
	

}
