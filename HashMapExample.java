import java.util.HashMap;
import java.util.*;

public class HashMapExample {

public static void main(String args[]) {
	
	HashMap<Integer,Integer> hm=new HashMap<>();
	
	int c,a=-1,b=1;
	for(int i=1;i<15;i++) {
		
		c=a+b;
		
		hm.put(i,c);
		
		a=b;
		b=c;
		
		
	}
	
	
	if(hm.containsKey(15)) {
		
		System.out.println("Yes");
		
		
	}
	  Iterator hmIterator = hm.entrySet().iterator(); 
 //	System.out.println(hm);
	while(hmIterator.hasNext()) {
		
		Map.Entry mapElement=(Map.Entry)hmIterator.next();
		
		int marks = (int) mapElement.getValue();
		 System.out.println(mapElement.getKey() + " : " + marks); 
	}
	
	
}
	
	
	
	
}
